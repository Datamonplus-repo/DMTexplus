package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrarcabeceraproductocompuesto extends GXProcedure
{
   public registrarcabeceraproductocompuesto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrarcabeceraproductocompuesto.class ), "" );
   }

   public registrarcabeceraproductocompuesto( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.genexus.SdtMessages_Message executeUdp( String aP0 )
   {
      registrarcabeceraproductocompuesto.this.aP1 = new com.genexus.SdtMessages_Message[] {new com.genexus.SdtMessages_Message()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        com.genexus.SdtMessages_Message[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             com.genexus.SdtMessages_Message[] aP1 )
   {
      registrarcabeceraproductocompuesto.this.AV11PrdNum = aP0;
      registrarcabeceraproductocompuesto.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Existe = false ;
      GXt_char1 = AV8EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      registrarcabeceraproductocompuesto.this.GXt_char1 = GXv_char2[0] ;
      AV8EmprCod = GXt_char1 ;
      /* Using cursor P098E2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV11PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P098E2_A719PrdNum[0] ;
         A396EmprCod = P098E2_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV9Existe = true ;
         AV15GXLvl8 = (byte)(0) ;
         /* Using cursor P098E3 */
         pr_default.execute(1, new Object[] {AV8EmprCod, AV11PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A688PrdComCod = P098E3_A688PrdComCod[0] ;
            A396EmprCod = P098E3_A396EmprCod[0] ;
            AV15GXLvl8 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV15GXLvl8 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPCPRDCO

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV8EmprCod ;
            A688PrdComCod = AV11PrdNum ;
            /* Using cursor P098E4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A688PrdComCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDCO");
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
            A396EmprCod = W396EmprCod ;
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! AV9Existe )
      {
         AV10message.setgxTv_SdtMessages_Message_Id( "1" );
         AV10message.setgxTv_SdtMessages_Message_Description( GXutil.format( httpContext.getMessage( "No existe el codigo del producto: %1", ""), AV11PrdNum, "", "", "", "", "", "", "", "") );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = registrarcabeceraproductocompuesto.this.AV10message;
      Application.commitDataStores(context, remoteHandle, pr_default, "registrarcabeceraproductocompuesto");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV8EmprCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P098E2_A719PrdNum = new String[] {""} ;
      P098E2_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      P098E3_A688PrdComCod = new String[] {""} ;
      P098E3_A396EmprCod = new String[] {""} ;
      A688PrdComCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.registrarcabeceraproductocompuesto__default(),
         new Object[] {
             new Object[] {
            P098E2_A719PrdNum, P098E2_A396EmprCod
            }
            , new Object[] {
            P098E3_A688PrdComCod, P098E3_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15GXLvl8 ;
   private short Gx_err ;
   private int GX_INS160 ;
   private String AV11PrdNum ;
   private String AV8EmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String A688PrdComCod ;
   private String Gx_emsg ;
   private boolean AV9Existe ;
   private com.genexus.SdtMessages_Message[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P098E2_A719PrdNum ;
   private String[] P098E2_A396EmprCod ;
   private String[] P098E3_A688PrdComCod ;
   private String[] P098E3_A396EmprCod ;
   private com.genexus.SdtMessages_Message AV10message ;
}

final  class registrarcabeceraproductocompuesto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098E2", "SELECT PrdNum, EmprCod FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098E3", "SELECT PrdComCod, EmprCod FROM TXPCPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P098E4", "INSERT INTO TXPCPRDCO(EmprCod, PrdComCod) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDCO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

