package app ;
import com.genexus.*;

public final  class StructSdtSdtEncabezadoPedido implements Cloneable, java.io.Serializable
{
   public StructSdtSdtEncabezadoPedido( )
   {
      this( -1, new ModelContext( StructSdtSdtEncabezadoPedido.class ));
   }

   public StructSdtSdtEncabezadoPedido( int remoteHandle ,
                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSdtEncabezadoPedido_Disenccli = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disfec = cal.getTime() ;
      gxTv_SdtSdtEncabezadoPedido_Disfeccli = cal.getTime() ;
      gxTv_SdtSdtEncabezadoPedido_Disfecent = cal.getTime() ;
      gxTv_SdtSdtEncabezadoPedido_Albrreo = "" ;
      gxTv_SdtSdtEncabezadoPedido_Displa = "" ;
      gxTv_SdtSdtEncabezadoPedido_Observaciones = "" ;
      gxTv_SdtSdtEncabezadoPedido_Discolnom = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disobs = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnomcli = "" ;
      gxTv_SdtSdtEncabezadoPedido_Cod_idtx = "" ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_modelo = "" ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_statio = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disexp = "" ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_artcli = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disitem3 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid01 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst01 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid02 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst02 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid03 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst03 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid04 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst04 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid05 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst05 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disordcomp = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disrec = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disdest = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disdes = "" ;
      gxTv_SdtSdtEncabezadoPedido_Distipdis = "" ;
      gxTv_SdtSdtEncabezadoPedido_Pricod = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disfec_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Disfeccli_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Disfecent_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Articulopedido_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Clicod = value ;
   }

   public String getDisenccli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disenccli ;
   }

   public void setDisenccli( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disenccli = value ;
   }

   public java.util.Date getDisfec( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disfec ;
   }

   public void setDisfec( java.util.Date value )
   {
      gxTv_SdtSdtEncabezadoPedido_Disfec_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disfec = value ;
   }

   public java.util.Date getDisfeccli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disfeccli ;
   }

   public void setDisfeccli( java.util.Date value )
   {
      gxTv_SdtSdtEncabezadoPedido_Disfeccli_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disfeccli = value ;
   }

   public java.util.Date getDisfecent( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disfecent ;
   }

   public void setDisfecent( java.util.Date value )
   {
      gxTv_SdtSdtEncabezadoPedido_Disfecent_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disfecent = value ;
   }

   public String getAlbrreo( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Albrreo ;
   }

   public void setAlbrreo( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Albrreo = value ;
   }

   public String getDispla( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Displa ;
   }

   public void setDispla( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Displa = value ;
   }

   public String getObservaciones( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Observaciones ;
   }

   public void setObservaciones( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Observaciones = value ;
   }

   public String getDiscolnom( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Discolnom ;
   }

   public void setDiscolnom( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Discolnom = value ;
   }

   public int getDiscolnum( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Discolnum ;
   }

   public void setDiscolnum( int value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Discolnum = value ;
   }

   public byte getDistipcol( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Distipcol ;
   }

   public void setDistipcol( byte value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Distipcol = value ;
   }

   public String getDisobs( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disobs ;
   }

   public void setDisobs( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disobs = value ;
   }

   public String getDisnomcli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnomcli ;
   }

   public void setDisnomcli( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnomcli = value ;
   }

   public int getDisnumcli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnumcli ;
   }

   public void setDisnumcli( int value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnumcli = value ;
   }

   public String getCod_idtx( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Cod_idtx ;
   }

   public void setCod_idtx( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Cod_idtx = value ;
   }

   public String getNxt_modelo( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Nxt_modelo ;
   }

   public void setNxt_modelo( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_modelo = value ;
   }

   public String getNxt_statio( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Nxt_statio ;
   }

   public void setNxt_statio( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_statio = value ;
   }

   public String getDisexp( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disexp ;
   }

   public void setDisexp( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disexp = value ;
   }

   public String getNxt_artcli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Nxt_artcli ;
   }

   public void setNxt_artcli( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_artcli = value ;
   }

   public String getDisitem3( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disitem3 ;
   }

   public void setDisitem3( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disitem3 = value ;
   }

   public short getDispart( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Dispart ;
   }

   public void setDispart( short value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Dispart = value ;
   }

   public String getDisnormid01( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid01 ;
   }

   public void setDisnormid01( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid01 = value ;
   }

   public String getDisnormst01( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst01 ;
   }

   public void setDisnormst01( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst01 = value ;
   }

   public String getDisnormid02( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid02 ;
   }

   public void setDisnormid02( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid02 = value ;
   }

   public String getDisnormst02( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst02 ;
   }

   public void setDisnormst02( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst02 = value ;
   }

   public String getDisnormid03( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid03 ;
   }

   public void setDisnormid03( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid03 = value ;
   }

   public String getDisnormst03( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst03 ;
   }

   public void setDisnormst03( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst03 = value ;
   }

   public String getDisnormid04( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid04 ;
   }

   public void setDisnormid04( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid04 = value ;
   }

   public String getDisnormst04( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst04 ;
   }

   public void setDisnormst04( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst04 = value ;
   }

   public String getDisnormid05( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid05 ;
   }

   public void setDisnormid05( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid05 = value ;
   }

   public String getDisnormst05( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst05 ;
   }

   public void setDisnormst05( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst05 = value ;
   }

   public short getProcecod( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Procecod ;
   }

   public void setProcecod( short value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Procecod = value ;
   }

   public String getDisordcomp( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disordcomp ;
   }

   public void setDisordcomp( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disordcomp = value ;
   }

   public String getDisrec( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disrec ;
   }

   public void setDisrec( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disrec = value ;
   }

   public String getDisdest( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disdest ;
   }

   public void setDisdest( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disdest = value ;
   }

   public String getDisdes( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disdes ;
   }

   public void setDisdes( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disdes = value ;
   }

   public String getDistipdis( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Distipdis ;
   }

   public void setDistipdis( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Distipdis = value ;
   }

   public String getPricod( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Pricod ;
   }

   public void setPricod( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Pricod = value ;
   }

   public byte getDisest( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disest ;
   }

   public void setDisest( byte value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disest = value ;
   }

   public java.util.Vector<app.StructSdtSdtArticuloPedido> getArticulopedido( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Articulopedido ;
   }

   public void setArticulopedido( java.util.Vector<app.StructSdtSdtArticuloPedido> value )
   {
      gxTv_SdtSdtEncabezadoPedido_Articulopedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Articulopedido = value ;
   }

   protected byte gxTv_SdtSdtEncabezadoPedido_Distipcol ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disest ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disfec_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disfeccli_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disfecent_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Articulopedido_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_N ;
   protected short gxTv_SdtSdtEncabezadoPedido_Dispart ;
   protected short gxTv_SdtSdtEncabezadoPedido_Procecod ;
   protected int gxTv_SdtSdtEncabezadoPedido_Clicod ;
   protected int gxTv_SdtSdtEncabezadoPedido_Discolnum ;
   protected int gxTv_SdtSdtEncabezadoPedido_Disnumcli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disenccli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Albrreo ;
   protected String gxTv_SdtSdtEncabezadoPedido_Displa ;
   protected String gxTv_SdtSdtEncabezadoPedido_Discolnom ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disobs ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnomcli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Cod_idtx ;
   protected String gxTv_SdtSdtEncabezadoPedido_Nxt_modelo ;
   protected String gxTv_SdtSdtEncabezadoPedido_Nxt_statio ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disexp ;
   protected String gxTv_SdtSdtEncabezadoPedido_Nxt_artcli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disitem3 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid01 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst01 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid02 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst02 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid03 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst03 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid04 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst04 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid05 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst05 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disrec ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disdest ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disdes ;
   protected String gxTv_SdtSdtEncabezadoPedido_Distipdis ;
   protected String gxTv_SdtSdtEncabezadoPedido_Pricod ;
   protected String gxTv_SdtSdtEncabezadoPedido_Observaciones ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disordcomp ;
   protected java.util.Date gxTv_SdtSdtEncabezadoPedido_Disfec ;
   protected java.util.Date gxTv_SdtSdtEncabezadoPedido_Disfeccli ;
   protected java.util.Date gxTv_SdtSdtEncabezadoPedido_Disfecent ;
   protected java.util.Vector<app.StructSdtSdtArticuloPedido> gxTv_SdtSdtEncabezadoPedido_Articulopedido=null ;
}

