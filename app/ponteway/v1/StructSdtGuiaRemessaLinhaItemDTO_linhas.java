package app.ponteway.v1 ;
import com.genexus.*;

public final  class StructSdtGuiaRemessaLinhaItemDTO_linhas implements Cloneable, java.io.Serializable
{
   public StructSdtGuiaRemessaLinhaItemDTO_linhas( )
   {
      this( -1, new ModelContext( StructSdtGuiaRemessaLinhaItemDTO_linhas.class ));
   }

   public StructSdtGuiaRemessaLinhaItemDTO_linhas( int remoteHandle ,
                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha = cal.getTime() ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public boolean getSelected( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod = value ;
   }

   public long getNmrgui( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui ;
   }

   public void setNmrgui( long value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui = value ;
   }

   public short getSerie( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie ;
   }

   public void setSerie( short value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie = value ;
   }

   public String getLocaldes( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes ;
   }

   public void setLocaldes( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes = value ;
   }

   public String getOrdemtingimento( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento ;
   }

   public void setOrdemtingimento( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento = value ;
   }

   public java.util.Date getFecha( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha ;
   }

   public void setFecha( java.util.Date value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha = value ;
   }

   public long getCodfornecedor( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor ;
   }

   public void setCodfornecedor( long value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor = value ;
   }

   public long getLinha( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha ;
   }

   public void setLinha( long value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha = value ;
   }

   public String getCodartigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo ;
   }

   public void setCodartigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo = value ;
   }

   public String getArtigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo ;
   }

   public void setArtigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo = value ;
   }

   public short getRolos( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos ;
   }

   public void setRolos( short value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos = value ;
   }

   public short getRolos_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior ;
   }

   public void setRolos_anterior( short value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior = value ;
   }

   public java.math.BigDecimal getQuantidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade ;
   }

   public void setQuantidade( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade = value ;
   }

   public java.math.BigDecimal getQuantidade_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior ;
   }

   public void setQuantidade_anterior( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior = value ;
   }

   public String getReferencia( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia ;
   }

   public void setReferencia( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia = value ;
   }

   public String getUnidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade ;
   }

   public void setUnidade( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade = value ;
   }

   public String getUnidade_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior ;
   }

   public void setUnidade_anterior( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior = value ;
   }

   public String getReclamacion( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion ;
   }

   public void setReclamacion( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion = value ;
   }

   public String getLote( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote ;
   }

   public void setLote( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = value ;
   }

   public java.math.BigDecimal getLu( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu ;
   }

   public void setLu( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu = value ;
   }

   public java.math.BigDecimal getLfa( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa ;
   }

   public void setLfa( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa = value ;
   }

   public String getRelatoriocomposicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao ;
   }

   public void setRelatoriocomposicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao = value ;
   }

   public String getTear( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear ;
   }

   public void setTear( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear = value ;
   }

   public String getAberta( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta ;
   }

   public void setAberta( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta = value ;
   }

   public String getJogo( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo ;
   }

   public void setJogo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo = value ;
   }

   public String getPolegadas( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas ;
   }

   public void setPolegadas( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas = value ;
   }

   public String getObservacoes( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes ;
   }

   public void setObservacoes( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes = value ;
   }

   public String getLocalizacao( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao ;
   }

   public void setLocalizacao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao = value ;
   }

   public String getLocalizacao_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior ;
   }

   public void setLocalizacao_anterior( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior = value ;
   }

   public String getAfn( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn ;
   }

   public void setAfn( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn = value ;
   }

   public String getFio( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio ;
   }

   public void setFio( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = value ;
   }

   public String getFio_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior ;
   }

   public void setFio_anterior( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior = value ;
   }

   public String getMaquina( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina ;
   }

   public void setMaquina( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = value ;
   }

   public String getEntrada( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada ;
   }

   public void setEntrada( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada = value ;
   }

   public String getVossarequisicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao ;
   }

   public void setVossarequisicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao = value ;
   }

   public String getCodartigoclientecr( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr ;
   }

   public void setCodartigoclientecr( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr = value ;
   }

   public String getCodartigoclienteac( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac ;
   }

   public void setCodartigoclienteac( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac = value ;
   }

   public String getSerienmrguia( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia ;
   }

   public void setSerienmrguia( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia = value ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N ;
   protected short gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie ;
   protected short gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos ;
   protected short gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior ;
   protected long gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui ;
   protected long gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor ;
   protected long gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn ;
   protected boolean gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia ;
   protected java.util.Date gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa ;
}

