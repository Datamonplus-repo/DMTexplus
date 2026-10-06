package app.oliveiraegoncalves.v1 ;
import com.genexus.*;

public final  class StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem implements Cloneable, java.io.Serializable
{
   public StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem( )
   {
      this( -1, new ModelContext( StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem.class ));
   }

   public StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem( int remoteHandle ,
                                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento = cal.getTime() ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento = new java.math.BigDecimal(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N = (byte)(1) ;
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

   public java.util.Vector<app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> getLinhas( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas ;
   }

   public void setLinhas( java.util.Vector<app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas = value ;
   }

   public String getSerie( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie ;
   }

   public void setSerie( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie = value ;
   }

   public java.math.BigDecimal getNumeroguia( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia ;
   }

   public void setNumeroguia( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia = value ;
   }

   public String getCodcliente( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente ;
   }

   public void setCodcliente( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente = value ;
   }

   public String getCodclienteintegracao( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao ;
   }

   public void setCodclienteintegracao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao = value ;
   }

   public String getNomecliente( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente ;
   }

   public void setNomecliente( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente = value ;
   }

   public java.util.Date getDatadocumento( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento ;
   }

   public void setDatadocumento( java.util.Date value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento = value ;
   }

   public java.math.BigDecimal getTotaldocumento( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento ;
   }

   public void setTotaldocumento( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento = value ;
   }

   public String getLocaldescarga( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga ;
   }

   public void setLocaldescarga( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga = value ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia ;
   protected java.util.Date gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento ;
   protected java.util.Vector<app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas=null ;
}

