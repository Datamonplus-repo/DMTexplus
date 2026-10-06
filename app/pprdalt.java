package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdalt extends GXProcedure
{
   public pprdalt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdalt.class ), "" );
   }

   public pprdalt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 )
   {
      pprdalt.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 )
   {
      pprdalt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdalt.this.AV15PrdNum = aP1[0];
      this.aP1 = aP1;
      pprdalt.this.AV16PrdAltNum = aP2[0];
      this.aP2 = aP2;
      pprdalt.this.AV17PrdAltFac = aP3[0];
      this.aP3 = aP3;
      pprdalt.this.AV19PrdAltCam = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPPRDALT

      */
      A719PrdNum = AV16PrdAltNum ;
      A680PrdAltNum = AV15PrdNum ;
      A678PrdAltFac = DecimalUtil.doubleToDec(1).divide(AV17PrdAltFac, 18, java.math.RoundingMode.DOWN) ;
      /* Using cursor P004X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A680PrdAltNum, A678PrdAltFac});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALT");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P004X3 */
         pr_default.execute(1, new Object[] {AV17PrdAltFac, A396EmprCod, A719PrdNum, A680PrdAltNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALT");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdalt.this.A396EmprCod;
      this.aP1[0] = pprdalt.this.AV15PrdNum;
      this.aP2[0] = pprdalt.this.AV16PrdAltNum;
      this.aP3[0] = pprdalt.this.AV17PrdAltFac;
      this.aP4[0] = pprdalt.this.AV19PrdAltCam;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprdalt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A719PrdNum = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdalt__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19PrdAltCam ;
   private short Gx_err ;
   private int GX_INS78 ;
   private java.math.BigDecimal AV17PrdAltFac ;
   private java.math.BigDecimal A678PrdAltFac ;
   private String A396EmprCod ;
   private String AV15PrdNum ;
   private String AV16PrdAltNum ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private String Gx_emsg ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pprdalt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004X2", "INSERT INTO TXPPRDALT(EmprCod, PrdNum, PrdAltNum, PrdAltFac, PrdAltCam) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALT")
         ,new UpdateCursor("P004X3", "UPDATE TXPPRDALT SET PrdAltFac=CAST(1 / ? AS NUMERIC(17,10))  WHERE EmprCod = ? and PrdNum = ? and PrdAltNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALT")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

