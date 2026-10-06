package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiocoloresbloqueadosobservaciones extends GXProcedure
{
   public cambiocoloresbloqueadosobservaciones( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiocoloresbloqueadosobservaciones.class ), "" );
   }

   public cambiocoloresbloqueadosobservaciones( int remoteHandle ,
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
                        String aP6 ,
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
                             String aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      cambiocoloresbloqueadosobservaciones.this.AV12EMprcod = aP0;
      cambiocoloresbloqueadosobservaciones.this.AV8clicod = aP1;
      cambiocoloresbloqueadosobservaciones.this.AV16forser = aP2;
      cambiocoloresbloqueadosobservaciones.this.AV13forcolnom = aP3;
      cambiocoloresbloqueadosobservaciones.this.AV14forcolnum = aP4;
      cambiocoloresbloqueadosobservaciones.this.AV23tipcolcod = aP5;
      cambiocoloresbloqueadosobservaciones.this.AV11colores_json = aP6;
      cambiocoloresbloqueadosobservaciones.this.AV24usurcod = aP7;
      cambiocoloresbloqueadosobservaciones.this.AV21station = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Colores.fromJSonString(AV11colores_json, null);
      if ( AV10Colores.size() > 0 )
      {
         AV30Observaciones.clear();
         /* Using cursor P0AQL2 */
         pr_default.execute(0, new Object[] {AV12EMprcod, Integer.valueOf(AV8clicod), AV16forser, AV13forcolnom, Integer.valueOf(AV14forcolnum), Byte.valueOf(AV23tipcolcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A831TipColCod = P0AQL2_A831TipColCod[0] ;
            A483ForColNum = P0AQL2_A483ForColNum[0] ;
            A482ForColNom = P0AQL2_A482ForColNom[0] ;
            A494ForSer = P0AQL2_A494ForSer[0] ;
            A252CliCod = P0AQL2_A252CliCod[0] ;
            A396EmprCod = P0AQL2_A396EmprCod[0] ;
            A651ObsUltLin = P0AQL2_A651ObsUltLin[0] ;
            n651ObsUltLin = P0AQL2_n651ObsUltLin[0] ;
            AV20ObsUltLin = A651ObsUltLin ;
            /* Using cursor P0AQL3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A649ObsForTxt = P0AQL3_A649ObsForTxt[0] ;
               A650ObsLin = P0AQL3_A650ObsLin[0] ;
               AV31Observacion = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV31Observacion.setgxTv_SdtMessages_Message_Id( localUtil.format( DecimalUtil.doubleToDec(A650ObsLin), "ZZ9") );
               AV31Observacion.setgxTv_SdtMessages_Message_Description( A649ObsForTxt );
               AV30Observaciones.add(AV31Observacion, 0);
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV39GXV1 = 1 ;
         while ( AV39GXV1 <= AV10Colores.size() )
         {
            AV9Color = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV10Colores.elementAt(-1+AV39GXV1));
            AV25Vclicod = (int)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 1, 6))) ;
            AV28Vforser = GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 7, 16) ;
            AV26Vforcolnom = GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 23, 13) ;
            AV27Vforcolnum = (int)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 36, 6))) ;
            AV29Vtipcolcod = (byte)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 42, 2))) ;
            AV40GXV2 = 1 ;
            while ( AV40GXV2 <= AV30Observaciones.size() )
            {
               AV31Observacion = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV30Observaciones.elementAt(-1+AV40GXV2));
               AV32obslin = (short)(GXutil.lval( AV31Observacion.getgxTv_SdtMessages_Message_Id())) ;
               AV33ObsForTxt = AV31Observacion.getgxTv_SdtMessages_Message_Description() ;
               /*
                  INSERT RECORD ON TABLE TXPLOBFOR

               */
               A396EmprCod = AV12EMprcod ;
               A252CliCod = AV25Vclicod ;
               A494ForSer = AV28Vforser ;
               A482ForColNom = AV26Vforcolnom ;
               A483ForColNum = AV27Vforcolnum ;
               A831TipColCod = AV29Vtipcolcod ;
               A650ObsLin = AV32obslin ;
               A649ObsForTxt = AV33ObsForTxt ;
               /* Using cursor P0AQL4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A650ObsLin), A649ObsForTxt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
               if ( (pr_default.getStatus(2) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               AV40GXV2 = (int)(AV40GXV2+1) ;
            }
            AV39GXV1 = (int)(AV39GXV1+1) ;
         }
         AV41GXV3 = 1 ;
         while ( AV41GXV3 <= AV10Colores.size() )
         {
            AV9Color = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV10Colores.elementAt(-1+AV41GXV3));
            AV25Vclicod = (int)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 1, 6))) ;
            AV28Vforser = GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 7, 16) ;
            AV26Vforcolnom = GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 23, 13) ;
            AV27Vforcolnum = (int)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 36, 6))) ;
            AV29Vtipcolcod = (byte)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 42, 2))) ;
            n651ObsUltLin = false ;
            /* Optimized UPDATE. */
            /* Using cursor P0AQL5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n651ObsUltLin), Short.valueOf(AV20ObsUltLin), AV12EMprcod, Integer.valueOf(AV25Vclicod), AV28Vforser, AV26Vforcolnom, Integer.valueOf(AV27Vforcolnum), Byte.valueOf(AV29Vtipcolcod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
            /* End optimized UPDATE. */
            AV41GXV3 = (int)(AV41GXV3+1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.cambiocoloresbloqueadosobservaciones");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Colores = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV30Observaciones = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P0AQL2_A831TipColCod = new byte[1] ;
      P0AQL2_A483ForColNum = new int[1] ;
      P0AQL2_A482ForColNom = new String[] {""} ;
      P0AQL2_A494ForSer = new String[] {""} ;
      P0AQL2_A252CliCod = new int[1] ;
      P0AQL2_A396EmprCod = new String[] {""} ;
      P0AQL2_A651ObsUltLin = new short[1] ;
      P0AQL2_n651ObsUltLin = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      P0AQL3_A396EmprCod = new String[] {""} ;
      P0AQL3_A252CliCod = new int[1] ;
      P0AQL3_A494ForSer = new String[] {""} ;
      P0AQL3_A482ForColNom = new String[] {""} ;
      P0AQL3_A483ForColNum = new int[1] ;
      P0AQL3_A831TipColCod = new byte[1] ;
      P0AQL3_A649ObsForTxt = new String[] {""} ;
      P0AQL3_A650ObsLin = new short[1] ;
      A649ObsForTxt = "" ;
      AV31Observacion = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV9Color = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV28Vforser = "" ;
      AV26Vforcolnom = "" ;
      AV33ObsForTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiocoloresbloqueadosobservaciones__default(),
         new Object[] {
             new Object[] {
            P0AQL2_A831TipColCod, P0AQL2_A483ForColNum, P0AQL2_A482ForColNom, P0AQL2_A494ForSer, P0AQL2_A252CliCod, P0AQL2_A396EmprCod, P0AQL2_A651ObsUltLin, P0AQL2_n651ObsUltLin
            }
            , new Object[] {
            P0AQL3_A396EmprCod, P0AQL3_A252CliCod, P0AQL3_A494ForSer, P0AQL3_A482ForColNom, P0AQL3_A483ForColNum, P0AQL3_A831TipColCod, P0AQL3_A649ObsForTxt, P0AQL3_A650ObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23tipcolcod ;
   private byte A831TipColCod ;
   private byte AV29Vtipcolcod ;
   private short A651ObsUltLin ;
   private short AV20ObsUltLin ;
   private short A650ObsLin ;
   private short AV32obslin ;
   private short Gx_err ;
   private int AV8clicod ;
   private int AV14forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV39GXV1 ;
   private int AV25Vclicod ;
   private int AV27Vforcolnum ;
   private int AV40GXV2 ;
   private int GX_INS74 ;
   private int AV41GXV3 ;
   private String AV12EMprcod ;
   private String AV16forser ;
   private String AV13forcolnom ;
   private String AV24usurcod ;
   private String AV21station ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A649ObsForTxt ;
   private String AV28Vforser ;
   private String AV26Vforcolnom ;
   private String AV33ObsForTxt ;
   private String Gx_emsg ;
   private boolean n651ObsUltLin ;
   private String AV11colores_json ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AQL2_A831TipColCod ;
   private int[] P0AQL2_A483ForColNum ;
   private String[] P0AQL2_A482ForColNom ;
   private String[] P0AQL2_A494ForSer ;
   private int[] P0AQL2_A252CliCod ;
   private String[] P0AQL2_A396EmprCod ;
   private short[] P0AQL2_A651ObsUltLin ;
   private boolean[] P0AQL2_n651ObsUltLin ;
   private String[] P0AQL3_A396EmprCod ;
   private int[] P0AQL3_A252CliCod ;
   private String[] P0AQL3_A494ForSer ;
   private String[] P0AQL3_A482ForColNom ;
   private int[] P0AQL3_A483ForColNum ;
   private byte[] P0AQL3_A831TipColCod ;
   private String[] P0AQL3_A649ObsForTxt ;
   private short[] P0AQL3_A650ObsLin ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Colores ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV30Observaciones ;
   private com.genexus.SdtMessages_Message AV31Observacion ;
   private com.genexus.SdtMessages_Message AV9Color ;
}

final  class cambiocoloresbloqueadosobservaciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQL2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsUltLin FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQL3", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AQL4", "INSERT INTO TXPLOBFOR(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin, ObsForTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new UpdateCursor("P0AQL5", "UPDATE TXPCFORMU SET ObsUltLin=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 30);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

