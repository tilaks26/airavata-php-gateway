<?php
namespace Airavata\Model;

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


class Workflow {
  static $_TSPEC;

  /**
   * @var string
   */
  public $templateId = "DO_NOT_SET_AT_CLIENTS";
  /**
   * @var string
   */
  public $name = null;
  /**
   * @var string
   */
  public $graph = null;
  /**
   * @var string
   */
  public $image = null;
  /**
   * @var \Airavata\Model\AppCatalog\AppInterface\InputDataObjectType[]
   */
  public $workflowInputs = null;
  /**
   * @var \Airavata\Model\AppCatalog\AppInterface\OutputDataObjectType[]
   */
  public $workflowOutputs = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'templateId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'name',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'graph',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'image',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'workflowInputs',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\AppInterface\InputDataObjectType',
            ),
          ),
        6 => array(
          'var' => 'workflowOutputs',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\AppInterface\OutputDataObjectType',
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['templateId'])) {
        $this->templateId = $vals['templateId'];
      }
      if (isset($vals['name'])) {
        $this->name = $vals['name'];
      }
      if (isset($vals['graph'])) {
        $this->graph = $vals['graph'];
      }
      if (isset($vals['image'])) {
        $this->image = $vals['image'];
      }
      if (isset($vals['workflowInputs'])) {
        $this->workflowInputs = $vals['workflowInputs'];
      }
      if (isset($vals['workflowOutputs'])) {
        $this->workflowOutputs = $vals['workflowOutputs'];
      }
    }
  }

  public function getName() {
    return 'Workflow';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->templateId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->name);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->graph);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->image);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::LST) {
            $this->workflowInputs = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $elem5 = new \Airavata\Model\AppCatalog\AppInterface\InputDataObjectType();
              $xfer += $elem5->read($input);
              $this->workflowInputs []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::LST) {
            $this->workflowOutputs = array();
            $_size6 = 0;
            $_etype9 = 0;
            $xfer += $input->readListBegin($_etype9, $_size6);
            for ($_i10 = 0; $_i10 < $_size6; ++$_i10)
            {
              $elem11 = null;
              $elem11 = new \Airavata\Model\AppCatalog\AppInterface\OutputDataObjectType();
              $xfer += $elem11->read($input);
              $this->workflowOutputs []= $elem11;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('Workflow');
    if ($this->templateId !== null) {
      $xfer += $output->writeFieldBegin('templateId', TType::STRING, 1);
      $xfer += $output->writeString($this->templateId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->name !== null) {
      $xfer += $output->writeFieldBegin('name', TType::STRING, 2);
      $xfer += $output->writeString($this->name);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->graph !== null) {
      $xfer += $output->writeFieldBegin('graph', TType::STRING, 3);
      $xfer += $output->writeString($this->graph);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->image !== null) {
      $xfer += $output->writeFieldBegin('image', TType::STRING, 4);
      $xfer += $output->writeString($this->image);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->workflowInputs !== null) {
      if (!is_array($this->workflowInputs)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('workflowInputs', TType::LST, 5);
      {
        $output->writeListBegin(TType::STRUCT, count($this->workflowInputs));
        {
          foreach ($this->workflowInputs as $iter12)
          {
            $xfer += $iter12->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->workflowOutputs !== null) {
      if (!is_array($this->workflowOutputs)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('workflowOutputs', TType::LST, 6);
      {
        $output->writeListBegin(TType::STRUCT, count($this->workflowOutputs));
        {
          foreach ($this->workflowOutputs as $iter13)
          {
            $xfer += $iter13->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

final class Constant extends \Thrift\Type\TConstant {
  static protected $DEFAULT_ID;

  static protected function init_DEFAULT_ID() {
    return "DO_NOT_SET_AT_CLIENTS";
  }
}


