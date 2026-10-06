package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobscopyenc2 extends GXProcedure
{
   public pobscopyenc2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobscopyenc2.class ), "" );
   }

   public pobscopyenc2( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        int aP1 ,
                                                                        int aP2 ,
                                                                        String aP3 ,
                                                                        String aP4 )
   {
      pobscopyenc2.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 )
   {
      pobscopyenc2.this.A396EmprCod = aP0;
      pobscopyenc2.this.AV8Discod = aP1;
      pobscopyenc2.this.AV11Var_discod = aP2;
      pobscopyenc2.this.AV14usurcod = aP3;
      pobscopyenc2.this.AV15station = aP4;
      pobscopyenc2.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9DiscodAnt = AV11Var_discod ;
      AV12messages.clear();
      AV13message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV13message.setgxTv_SdtMessages_Message_Id( "0" );
      AV13message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Discod ", "")+GXutil.trim( GXutil.str( AV8Discod, 8, 0))+httpContext.getMessage( " Discod Anterior ", "")+GXutil.trim( GXutil.str( AV11Var_discod, 8, 0)) );
      AV12messages.add(AV13message, 0);
      /* Using cursor P0A2A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9DiscodAnt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P0A2A2_A361DisCod[0] ;
         A377DisObsTxt = P0A2A2_A377DisObsTxt[0] ;
         A376DisObsLin = P0A2A2_A376DisObsLin[0] ;
         A378DisObsULin = P0A2A2_A378DisObsULin[0] ;
         A378DisObsULin = P0A2A2_A378DisObsULin[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV10DisObsULin = A378DisObsULin ;
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W376DisObsLin = A376DisObsLin ;
         A361DisCod = AV8Discod ;
         AV13message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV13message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV8Discod, 8, 0)) );
         AV13message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Linea ", "")+GXutil.trim( GXutil.str( A376DisObsLin, 1, 0))+" "+GXutil.trim( A377DisObsTxt) );
         AV12messages.add(AV13message, 0);
         /* Using cursor P0A2A3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         A376DisObsLin = W376DisObsLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P0A2A4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV10DisObsULin), A396EmprCod, Integer.valueOf(AV8Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      if ( AV12messages.size() > 0 )
      {
         AV16json = AV12messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV21Pgmname, AV14usurcod, AV15station, AV16json, AV8Discod, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pobscopyenc2.this.AV12messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "pobscopyenc2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV13message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      scmdbuf = "" ;
      P0A2A2_A396EmprCod = new String[] {""} ;
      P0A2A2_A361DisCod = new int[1] ;
      P0A2A2_A377DisObsTxt = new String[] {""} ;
      P0A2A2_A376DisObsLin = new byte[1] ;
      P0A2A2_A378DisObsULin = new byte[1] ;
      A377DisObsTxt = "" ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      AV16json = "" ;
      AV21Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobscopyenc2__default(),
         new Object[] {
             new Object[] {
            P0A2A2_A396EmprCod, P0A2A2_A361DisCod, P0A2A2_A377DisObsTxt, P0A2A2_A376DisObsLin, P0A2A2_A378DisObsULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV21Pgmname = "PObsCopyEnc2" ;
      /* GeneXus formulas. */
      AV21Pgmname = "PObsCopyEnc2" ;
      Gx_err = (short)(0) ;
   }

   private byte A376DisObsLin ;
   private byte A378DisObsULin ;
   private byte AV10DisObsULin ;
   private byte W376DisObsLin ;
   private short Gx_err ;
   private int AV8Discod ;
   private int AV11Var_discod ;
   private int AV9DiscodAnt ;
   private int A361DisCod ;
   private int W361DisCod ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String AV14usurcod ;
   private String AV15station ;
   private String scmdbuf ;
   private String A377DisObsTxt ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private String AV21Pgmname ;
   private String AV16json ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A2A2_A396EmprCod ;
   private int[] P0A2A2_A361DisCod ;
   private String[] P0A2A2_A377DisObsTxt ;
   private byte[] P0A2A2_A376DisObsLin ;
   private byte[] P0A2A2_A378DisObsULin ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12messages ;
   private com.genexus.SdtMessages_Message AV13message ;
}

final  class pobscopyenc2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2A2", "SELECT T1.EmprCod, T1.DisCod, T1.DisObsTxt, T1.DisObsLin, T2.DisObsULin FROM (TXPOBSERV T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A2A3", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P0A2A4", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

