package app.ponteway.v1 ;
import com.genexus.*;

public final  class StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem implements Cloneable, java.io.Serializable
{
   public StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( )
   {
      this( -1, new ModelContext( StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem.class ));
   }

   public StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codunidade = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lu = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lfa = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Relatoriocomposicao = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Tear = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Aberta = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Observacoes = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Localizacao = "" ;
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

   public java.math.BigDecimal getLinha( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha ;
   }

   public void setLinha( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha = value ;
   }

   public String getCodartigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo ;
   }

   public void setCodartigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo = value ;
   }

   public String getArtigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo ;
   }

   public void setArtigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo = value ;
   }

   public java.math.BigDecimal getRolos( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos ;
   }

   public void setRolos( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos = value ;
   }

   public java.math.BigDecimal getQuantidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade ;
   }

   public void setQuantidade( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade = value ;
   }

   public String getLote( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote ;
   }

   public void setLote( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote = value ;
   }

   public String getJogo( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo ;
   }

   public void setJogo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo = value ;
   }

   public String getPolegadas( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas ;
   }

   public void setPolegadas( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas = value ;
   }

   public String getCodunidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codunidade ;
   }

   public void setCodunidade( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codunidade = value ;
   }

   public String getFio( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio ;
   }

   public void setFio( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio = value ;
   }

   public java.math.BigDecimal getLu( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lu ;
   }

   public void setLu( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lu = value ;
   }

   public java.math.BigDecimal getLfa( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lfa ;
   }

   public void setLfa( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lfa = value ;
   }

   public String getRelatoriocomposicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Relatoriocomposicao ;
   }

   public void setRelatoriocomposicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Relatoriocomposicao = value ;
   }

   public String getTear( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Tear ;
   }

   public void setTear( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Tear = value ;
   }

   public String getAberta( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Aberta ;
   }

   public void setAberta( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Aberta = value ;
   }

   public String getObservacoes( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Observacoes ;
   }

   public void setObservacoes( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Observacoes = value ;
   }

   public String getOrdemtingimento( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento ;
   }

   public void setOrdemtingimento( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento = value ;
   }

   public String getVossarequisicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao ;
   }

   public void setVossarequisicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao = value ;
   }

   public String getCodartigoclientecr( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr ;
   }

   public void setCodartigoclientecr( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr = value ;
   }

   public String getCodartigoclienteac( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac ;
   }

   public void setCodartigoclienteac( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac = value ;
   }

   public String getMaquina( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina ;
   }

   public void setMaquina( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina = value ;
   }

   public String getLocalizacao( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Localizacao ;
   }

   public void setLocalizacao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Localizacao = value ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Aberta ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codunidade ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Relatoriocomposicao ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Tear ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Observacoes ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Localizacao ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lu ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lfa ;
}

