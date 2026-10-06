package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class confirmacionpreciodocumento_producciones_prc extends GXProcedure
{
   public confirmacionpreciodocumento_producciones_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacionpreciodocumento_producciones_prc.class ), "" );
   }

   public confirmacionpreciodocumento_producciones_prc( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        java.math.BigDecimal aP8 ,
                        java.math.BigDecimal aP9 ,
                        String aP10 ,
                        String aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             java.math.BigDecimal aP8 ,
                             java.math.BigDecimal aP9 ,
                             String aP10 ,
                             String aP11 )
   {
      confirmacionpreciodocumento_producciones_prc.this.A396EmprCod = aP0;
      confirmacionpreciodocumento_producciones_prc.this.AV8Albprocod = aP1;
      confirmacionpreciodocumento_producciones_prc.this.AV9Barcod = aP2;
      confirmacionpreciodocumento_producciones_prc.this.AV10Barcodreo = aP3;
      confirmacionpreciodocumento_producciones_prc.this.AV11Barcodpar = aP4;
      confirmacionpreciodocumento_producciones_prc.this.AV12BarpreKgm = aP5;
      confirmacionpreciodocumento_producciones_prc.this.AV13BarPreMtr = aP6;
      confirmacionpreciodocumento_producciones_prc.this.AV14BarpreUnd = aP7;
      confirmacionpreciodocumento_producciones_prc.this.AV19AlbBarRec = aP8;
      confirmacionpreciodocumento_producciones_prc.this.AV15AlbImpMan = aP9;
      confirmacionpreciodocumento_producciones_prc.this.AV24usurcod = aP10;
      confirmacionpreciodocumento_producciones_prc.this.AV25station = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09ZU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8Albprocod), Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P09ZU2_A30AlbProCod[0] ;
         A1262BarPreKgm = P09ZU2_A1262BarPreKgm[0] ;
         A1264BarPreMtr = P09ZU2_A1264BarPreMtr[0] ;
         A12196BarPreUnd = P09ZU2_A12196BarPreUnd[0] ;
         A5354AlbImpMan = P09ZU2_A5354AlbImpMan[0] ;
         A40AlbProRec = P09ZU2_A40AlbProRec[0] ;
         A32AlbProEsp = P09ZU2_A32AlbProEsp[0] ;
         A2761AlbBarRec = P09ZU2_A2761AlbBarRec[0] ;
         A130BarCodPar = P09ZU2_A130BarCodPar[0] ;
         A132BarCodReo = P09ZU2_A132BarCodReo[0] ;
         A129BarCod = P09ZU2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV21Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV21Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Hdr =", "")+GXutil.trim( A13696BarNHdr) );
         AV21Message.setgxTv_SdtMessages_Message_Description( AV21Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Confirmacion Precios-ALBBAR. Precios Anteriores: Precio Kg= ", "")+GXutil.trim( GXutil.str( A1262BarPreKgm, 13, 5)) );
         AV21Message.setgxTv_SdtMessages_Message_Description( AV21Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Mt= ", "")+GXutil.trim( GXutil.str( A1264BarPreMtr, 13, 5))+httpContext.getMessage( " Precios Nuevos: Precio Kg= ", "")+GXutil.trim( GXutil.str( AV12BarpreKgm, 13, 5))+httpContext.getMessage( " Precio Mt= ", "")+GXutil.trim( GXutil.str( AV13BarPreMtr, 13, 5)) );
         AV22Messages.add(AV21Message, 0);
         A1262BarPreKgm = AV12BarpreKgm ;
         A1264BarPreMtr = AV13BarPreMtr ;
         A12196BarPreUnd = AV14BarpreUnd ;
         A5354AlbImpMan = AV15AlbImpMan ;
         A40AlbProRec = AV16Albprorec ;
         if ( A32AlbProEsp < 10 )
         {
            A32AlbProEsp = (byte)(A32AlbProEsp+10) ;
         }
         A2761AlbBarRec = AV19AlbBarRec ;
         /* Using cursor P09ZU3 */
         pr_default.execute(1, new Object[] {A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A5354AlbImpMan, A40AlbProRec, Byte.valueOf(A32AlbProEsp), A2761AlbBarRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV22Messages.size() > 0 )
      {
         AV30Var_json = AV22Messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV31Pgmname, AV24usurcod, AV25station, AV26inc_obs, (int)(AV8Albprocod), (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.confirmacionpreciodocumento_producciones_prc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P09ZU2_A396EmprCod = new String[] {""} ;
      P09ZU2_A30AlbProCod = new long[1] ;
      P09ZU2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZU2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZU2_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZU2_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZU2_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZU2_A32AlbProEsp = new byte[1] ;
      P09ZU2_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZU2_A130BarCodPar = new String[] {""} ;
      P09ZU2_A132BarCodReo = new byte[1] ;
      P09ZU2_A129BarCod = new int[1] ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV21Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV22Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV16Albprorec = DecimalUtil.ZERO ;
      AV30Var_json = "" ;
      AV31Pgmname = "" ;
      AV26inc_obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.confirmacionpreciodocumento_producciones_prc__default(),
         new Object[] {
             new Object[] {
            P09ZU2_A396EmprCod, P09ZU2_A30AlbProCod, P09ZU2_A1262BarPreKgm, P09ZU2_A1264BarPreMtr, P09ZU2_A12196BarPreUnd, P09ZU2_A5354AlbImpMan, P09ZU2_A40AlbProRec, P09ZU2_A32AlbProEsp, P09ZU2_A2761AlbBarRec, P09ZU2_A130BarCodPar,
            P09ZU2_A132BarCodReo, P09ZU2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      AV31Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_PRC" ;
      /* GeneXus formulas. */
      AV31Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_PRC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int A129BarCod ;
   private long AV8Albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV12BarpreKgm ;
   private java.math.BigDecimal AV13BarPreMtr ;
   private java.math.BigDecimal AV14BarpreUnd ;
   private java.math.BigDecimal AV19AlbBarRec ;
   private java.math.BigDecimal AV15AlbImpMan ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal AV16Albprorec ;
   private String A396EmprCod ;
   private String AV11Barcodpar ;
   private String AV24usurcod ;
   private String AV25station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV30Var_json ;
   private String AV31Pgmname ;
   private String AV26inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZU2_A396EmprCod ;
   private long[] P09ZU2_A30AlbProCod ;
   private java.math.BigDecimal[] P09ZU2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09ZU2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09ZU2_A12196BarPreUnd ;
   private java.math.BigDecimal[] P09ZU2_A5354AlbImpMan ;
   private java.math.BigDecimal[] P09ZU2_A40AlbProRec ;
   private byte[] P09ZU2_A32AlbProEsp ;
   private java.math.BigDecimal[] P09ZU2_A2761AlbBarRec ;
   private String[] P09ZU2_A130BarCodPar ;
   private byte[] P09ZU2_A132BarCodReo ;
   private int[] P09ZU2_A129BarCod ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV22Messages ;
   private com.genexus.SdtMessages_Message AV21Message ;
}

final  class confirmacionpreciodocumento_producciones_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZU2", "SELECT EmprCod, AlbProCod, BarPreKgm, BarPreMtr, BarPreUnd, AlbImpMan, AlbProRec, AlbProEsp, AlbBarRec, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09ZU3", "UPDATE TXPALBBAR SET BarPreKgm=?, BarPreMtr=?, BarPreUnd=?, AlbImpMan=?, AlbProRec=?, AlbProEsp=?, AlbBarRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               return;
      }
   }

}

