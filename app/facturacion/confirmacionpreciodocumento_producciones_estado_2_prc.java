package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class confirmacionpreciodocumento_producciones_estado_2_prc extends GXProcedure
{
   public confirmacionpreciodocumento_producciones_estado_2_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacionpreciodocumento_producciones_estado_2_prc.class ), "" );
   }

   public confirmacionpreciodocumento_producciones_estado_2_prc( int remoteHandle ,
                                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 )
   {
      confirmacionpreciodocumento_producciones_estado_2_prc.this.A396EmprCod = aP0;
      confirmacionpreciodocumento_producciones_estado_2_prc.this.AV10Albprocod = aP1;
      confirmacionpreciodocumento_producciones_estado_2_prc.this.AV12Barcod = aP2;
      confirmacionpreciodocumento_producciones_estado_2_prc.this.AV14Barcodreo = aP3;
      confirmacionpreciodocumento_producciones_estado_2_prc.this.AV13Barcodpar = aP4;
      confirmacionpreciodocumento_producciones_estado_2_prc.this.AV22usurcod = aP5;
      confirmacionpreciodocumento_producciones_estado_2_prc.this.AV23station = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Messages.clear();
      /* Using cursor P09ZV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV10Albprocod), Integer.valueOf(AV12Barcod), Byte.valueOf(AV14Barcodreo), AV13Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P09ZV2_A30AlbProCod[0] ;
         A32AlbProEsp = P09ZV2_A32AlbProEsp[0] ;
         A130BarCodPar = P09ZV2_A130BarCodPar[0] ;
         A132BarCodReo = P09ZV2_A132BarCodReo[0] ;
         A129BarCod = P09ZV2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV20Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV20Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Hdr =", "")+GXutil.trim( A13696BarNHdr) );
         AV20Message.setgxTv_SdtMessages_Message_Description( AV20Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Estado ", "")+GXutil.trim( GXutil.str( A32AlbProEsp, 2, 0))+httpContext.getMessage( " pasa a 2", "") );
         AV21Messages.add(AV20Message, 0);
         A32AlbProEsp = (byte)(2) ;
         /* Using cursor P09ZV3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A32AlbProEsp), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV21Messages.size() > 0 )
      {
         AV28Var_json = AV21Messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV22usurcod, AV23station, AV24inc_obs, (int)(AV10Albprocod), (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.confirmacionpreciodocumento_producciones_estado_2_prc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P09ZV2_A396EmprCod = new String[] {""} ;
      P09ZV2_A30AlbProCod = new long[1] ;
      P09ZV2_A32AlbProEsp = new byte[1] ;
      P09ZV2_A130BarCodPar = new String[] {""} ;
      P09ZV2_A132BarCodReo = new byte[1] ;
      P09ZV2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV20Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV28Var_json = "" ;
      AV29Pgmname = "" ;
      AV24inc_obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.confirmacionpreciodocumento_producciones_estado_2_prc__default(),
         new Object[] {
             new Object[] {
            P09ZV2_A396EmprCod, P09ZV2_A30AlbProCod, P09ZV2_A32AlbProEsp, P09ZV2_A130BarCodPar, P09ZV2_A132BarCodReo, P09ZV2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      AV29Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_Estado_2_PRC" ;
      /* GeneXus formulas. */
      AV29Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_Estado_2_PRC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14Barcodreo ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV12Barcod ;
   private int A129BarCod ;
   private long AV10Albprocod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV13Barcodpar ;
   private String AV22usurcod ;
   private String AV23station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV28Var_json ;
   private String AV29Pgmname ;
   private String AV24inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZV2_A396EmprCod ;
   private long[] P09ZV2_A30AlbProCod ;
   private byte[] P09ZV2_A32AlbProEsp ;
   private String[] P09ZV2_A130BarCodPar ;
   private byte[] P09ZV2_A132BarCodReo ;
   private int[] P09ZV2_A129BarCod ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV21Messages ;
   private com.genexus.SdtMessages_Message AV20Message ;
}

final  class confirmacionpreciodocumento_producciones_estado_2_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZV2", "SELECT EmprCod, AlbProCod, AlbProEsp, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09ZV3", "UPDATE TXPALBBAR SET AlbProEsp=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

