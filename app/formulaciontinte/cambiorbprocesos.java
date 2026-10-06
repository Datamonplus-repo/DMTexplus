package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiorbprocesos extends GXProcedure
{
   public cambiorbprocesos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiorbprocesos.class ), "" );
   }

   public cambiorbprocesos( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        java.math.BigDecimal aP6 ,
                        String aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             java.math.BigDecimal aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      cambiorbprocesos.this.A396EmprCod = aP0;
      cambiorbprocesos.this.A252CliCod = aP1;
      cambiorbprocesos.this.A494ForSer = aP2;
      cambiorbprocesos.this.A482ForColNom = aP3;
      cambiorbprocesos.this.A483ForColNum = aP4;
      cambiorbprocesos.this.A831TipColCod = aP5;
      cambiorbprocesos.this.AV8ForRelBan = aP6;
      cambiorbprocesos.this.AV12station = aP7;
      cambiorbprocesos.this.AV13usurcod = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9inc_obs = " " ;
      AV11messages.clear();
      /* Using cursor P0AQI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P0AQI2_A764ProForCod[0] ;
         A8656ProForrbn = P0AQI2_A8656ProForrbn[0] ;
         A1160ProForL = P0AQI2_A1160ProForL[0] ;
         AV10message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV10message.setgxTv_SdtMessages_Message_Id( GXutil.trim( A764ProForCod) );
         AV10message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Cambio Rb ", "")+localUtil.format( A8656ProForrbn, "ZZ9.99")+httpContext.getMessage( " por ", "")+localUtil.format( AV8ForRelBan, "ZZZ9.99") );
         AV11messages.add(AV10message, 0);
         A8656ProForrbn = AV8ForRelBan ;
         /* Using cursor P0AQI3 */
         pr_default.execute(1, new Object[] {A8656ProForrbn, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11messages.size() > 0 )
      {
         AV9inc_obs = AV11messages.toJSonString(false) ;
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV13usurcod, AV12station, AV9inc_obs, 12345678, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.cambiorbprocesos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9inc_obs = "" ;
      AV11messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P0AQI2_A396EmprCod = new String[] {""} ;
      P0AQI2_A252CliCod = new int[1] ;
      P0AQI2_A494ForSer = new String[] {""} ;
      P0AQI2_A482ForColNom = new String[] {""} ;
      P0AQI2_A483ForColNum = new int[1] ;
      P0AQI2_A831TipColCod = new byte[1] ;
      P0AQI2_A764ProForCod = new String[] {""} ;
      P0AQI2_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQI2_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      AV10message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV17Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiorbprocesos__default(),
         new Object[] {
             new Object[] {
            P0AQI2_A396EmprCod, P0AQI2_A252CliCod, P0AQI2_A494ForSer, P0AQI2_A482ForColNom, P0AQI2_A483ForColNum, P0AQI2_A831TipColCod, P0AQI2_A764ProForCod, P0AQI2_A8656ProForrbn, P0AQI2_A1160ProForL
            }
            , new Object[] {
            }
         }
      );
      AV17Pgmname = "FormulacionTinte.CambioRbProcesos" ;
      /* GeneXus formulas. */
      AV17Pgmname = "FormulacionTinte.CambioRbProcesos" ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV8ForRelBan ;
   private java.math.BigDecimal A8656ProForrbn ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV12station ;
   private String AV13usurcod ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String AV17Pgmname ;
   private String AV9inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQI2_A396EmprCod ;
   private int[] P0AQI2_A252CliCod ;
   private String[] P0AQI2_A494ForSer ;
   private String[] P0AQI2_A482ForColNom ;
   private int[] P0AQI2_A483ForColNum ;
   private byte[] P0AQI2_A831TipColCod ;
   private String[] P0AQI2_A764ProForCod ;
   private java.math.BigDecimal[] P0AQI2_A8656ProForrbn ;
   private short[] P0AQI2_A1160ProForL ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11messages ;
   private com.genexus.SdtMessages_Message AV10message ;
}

final  class cambiorbprocesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQI2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForrbn, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AQI3", "UPDATE TXPLFORMU SET ProForrbn=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

