package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticu_procesos_ins extends GXProcedure
{
   public tarticu_procesos_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_procesos_ins.class ), "" );
   }

   public tarticu_procesos_ins( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      tarticu_procesos_ins.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      tarticu_procesos_ins.this.AV9emprcod = aP0;
      tarticu_procesos_ins.this.AV10Clicod = aP1;
      tarticu_procesos_ins.this.AV11Artcod = aP2;
      tarticu_procesos_ins.this.AV12Usurcod = aP3;
      tarticu_procesos_ins.this.AV8Procod = aP4[0];
      this.aP4 = aP4;
      tarticu_procesos_ins.this.AV13proact = aP5[0];
      this.aP5 = aP5;
      tarticu_procesos_ins.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14messages.clear();
      AV15message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV15message.setgxTv_SdtMessages_Message_Id( "0" );
      AV15message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Antes Ins ", "")+GXutil.trim( AV9emprcod)+" "+GXutil.trim( GXutil.str( AV10Clicod, 6, 0))+" "+GXutil.trim( AV11Artcod)+" "+AV8Procod );
      AV14messages.add(AV15message, 0);
      /*
         INSERT RECORD ON TABLE TXPARTLIN

      */
      A396EmprCod = AV9emprcod ;
      A252CliCod = AV10Clicod ;
      A65ArtCod = AV11Artcod ;
      A758ProCod = AV8Procod ;
      A10412ProAct = AV13proact ;
      A10553ProUserA = AV12Usurcod ;
      A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A12141ProSta = (byte)(0) ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A11272ProFabs = DecimalUtil.ZERO ;
      AV15message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV15message.setgxTv_SdtMessages_Message_Id( "1" );
      AV15message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Ins ", "")+GXutil.trim( AV9emprcod)+" "+GXutil.trim( GXutil.str( AV10Clicod, 6, 0))+" "+GXutil.trim( AV11Artcod)+" "+AV8Procod );
      AV14messages.add(AV15message, 0);
      /* Using cursor P0A9G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
      if ( (pr_default.getStatus(0) == 1) )
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
      AV15message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV15message.setgxTv_SdtMessages_Message_Id( "2" );
      AV15message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Despues Ins ", "")+GXutil.trim( AV9emprcod)+" "+GXutil.trim( GXutil.str( AV10Clicod, 6, 0))+" "+GXutil.trim( AV11Artcod)+" "+AV8Procod );
      AV14messages.add(AV15message, 0);
      AV16var_messages = AV14messages.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = tarticu_procesos_ins.this.AV8Procod;
      this.aP5[0] = tarticu_procesos_ins.this.AV13proact;
      this.aP6[0] = tarticu_procesos_ins.this.AV16var_messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "tarticu_procesos_ins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16var_messages = "" ;
      AV14messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV15message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A10412ProAct = "" ;
      A10553ProUserA = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A11272ProFabs = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos_ins__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12141ProSta ;
   private short Gx_err ;
   private int AV10Clicod ;
   private int GX_INS11 ;
   private int A252CliCod ;
   private java.math.BigDecimal A11272ProFabs ;
   private String AV9emprcod ;
   private String AV11Artcod ;
   private String AV12Usurcod ;
   private String AV8Procod ;
   private String AV13proact ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A10412ProAct ;
   private String A10553ProUserA ;
   private String A10555ProUserM ;
   private String Gx_emsg ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A10556ProFecM ;
   private String AV16var_messages ;
   private String[] aP6 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV14messages ;
   private com.genexus.SdtMessages_Message AV15message ;
}

final  class tarticu_procesos_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A9G2", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setDateTime(12, (java.util.Date)parms[11], false);
               return;
      }
   }

}

