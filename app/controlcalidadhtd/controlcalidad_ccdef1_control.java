package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_control extends GXProcedure
{
   public controlcalidad_ccdef1_control( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_control.class ), "" );
   }

   public controlcalidad_ccdef1_control( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        int aP1 ,
                                                                        short aP2 )
   {
      controlcalidad_ccdef1_control.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      controlcalidad_ccdef1_control.this.A396EmprCod = aP0;
      controlcalidad_ccdef1_control.this.A4031CCTCod = aP1;
      controlcalidad_ccdef1_control.this.A4034CCTLin = aP2;
      controlcalidad_ccdef1_control.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Messages.clear();
      /* Using cursor P0AQF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4044CCTLinTpoD = P0AQF2_A4044CCTLinTpoD[0] ;
         /* Using cursor P0AQF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4058CCFColNom = P0AQF3_A4058CCFColNom[0] ;
            A252CliCod = P0AQF3_A252CliCod[0] ;
            A65ArtCod = P0AQF3_A65ArtCod[0] ;
            A4059CCFColNum = P0AQF3_A4059CCFColNum[0] ;
            AV9Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV9Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "CCSTA", "") );
            AV9Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Eliminación no válida, hay información en CCSTA", "") );
            AV8Messages.add(AV9Message, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV8Messages.size() == 0 )
         {
            /* Using cursor P0AQF4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A12750CCOkLin = P0AQF4_A12750CCOkLin[0] ;
               A129BarCod = P0AQF4_A129BarCod[0] ;
               A132BarCodReo = P0AQF4_A132BarCodReo[0] ;
               A130BarCodPar = P0AQF4_A130BarCodPar[0] ;
               A758ProCod = P0AQF4_A758ProCod[0] ;
               A194BarOrdLin = P0AQF4_A194BarOrdLin[0] ;
               AV9Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV9Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "CC1", "") );
               AV9Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Eliminación no válida, hay información en CC1", "") );
               AV8Messages.add(AV9Message, 0);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccdef1_control.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P0AQF2_A396EmprCod = new String[] {""} ;
      P0AQF2_A4031CCTCod = new int[1] ;
      P0AQF2_A4034CCTLin = new short[1] ;
      P0AQF2_A4044CCTLinTpoD = new String[] {""} ;
      A4044CCTLinTpoD = "" ;
      P0AQF3_A396EmprCod = new String[] {""} ;
      P0AQF3_A4031CCTCod = new int[1] ;
      P0AQF3_A4034CCTLin = new short[1] ;
      P0AQF3_A4058CCFColNom = new String[] {""} ;
      P0AQF3_A252CliCod = new int[1] ;
      P0AQF3_A65ArtCod = new String[] {""} ;
      P0AQF3_A4059CCFColNum = new int[1] ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P0AQF4_A396EmprCod = new String[] {""} ;
      P0AQF4_A4031CCTCod = new int[1] ;
      P0AQF4_A4034CCTLin = new short[1] ;
      P0AQF4_A12750CCOkLin = new byte[1] ;
      P0AQF4_A129BarCod = new int[1] ;
      P0AQF4_A132BarCodReo = new byte[1] ;
      P0AQF4_A130BarCodPar = new String[] {""} ;
      P0AQF4_A758ProCod = new String[] {""} ;
      P0AQF4_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_control__default(),
         new Object[] {
             new Object[] {
            P0AQF2_A396EmprCod, P0AQF2_A4031CCTCod, P0AQF2_A4034CCTLin, P0AQF2_A4044CCTLinTpoD
            }
            , new Object[] {
            P0AQF3_A396EmprCod, P0AQF3_A4031CCTCod, P0AQF3_A4034CCTLin, P0AQF3_A4058CCFColNom, P0AQF3_A252CliCod, P0AQF3_A65ArtCod, P0AQF3_A4059CCFColNum
            }
            , new Object[] {
            P0AQF4_A396EmprCod, P0AQF4_A4031CCTCod, P0AQF4_A4034CCTLin, P0AQF4_A12750CCOkLin, P0AQF4_A129BarCod, P0AQF4_A132BarCodReo, P0AQF4_A130BarCodPar, P0AQF4_A758ProCod, P0AQF4_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12750CCOkLin ;
   private byte A132BarCodReo ;
   private short A4034CCTLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A4044CCTLinTpoD ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQF2_A396EmprCod ;
   private int[] P0AQF2_A4031CCTCod ;
   private short[] P0AQF2_A4034CCTLin ;
   private String[] P0AQF2_A4044CCTLinTpoD ;
   private String[] P0AQF3_A396EmprCod ;
   private int[] P0AQF3_A4031CCTCod ;
   private short[] P0AQF3_A4034CCTLin ;
   private String[] P0AQF3_A4058CCFColNom ;
   private int[] P0AQF3_A252CliCod ;
   private String[] P0AQF3_A65ArtCod ;
   private int[] P0AQF3_A4059CCFColNum ;
   private String[] P0AQF4_A396EmprCod ;
   private int[] P0AQF4_A4031CCTCod ;
   private short[] P0AQF4_A4034CCTLin ;
   private byte[] P0AQF4_A12750CCOkLin ;
   private int[] P0AQF4_A129BarCod ;
   private byte[] P0AQF4_A132BarCodReo ;
   private String[] P0AQF4_A130BarCodPar ;
   private String[] P0AQF4_A758ProCod ;
   private short[] P0AQF4_A194BarOrdLin ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.genexus.SdtMessages_Message AV9Message ;
}

final  class controlcalidad_ccdef1_control__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQF2", "SELECT EmprCod, CCTCod, CCTLin, CCTLinTpoD FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQF3", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin, CCFColNom, CliCod, ArtCod, CCFColNum FROM TXPCCSta WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQF4", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin, CCOkLin, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPCC1 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

