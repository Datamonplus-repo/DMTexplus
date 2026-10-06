package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pproprvn extends GXProcedure
{
   public pproprvn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pproprvn.class ), "" );
   }

   public pproprvn( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        java.math.BigDecimal aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             java.math.BigDecimal aP3 )
   {
      pproprvn.this.A396EmprCod = aP0;
      pproprvn.this.AV8PrdNum = aP1;
      pproprvn.this.AV10PrvNum = aP2;
      pproprvn.this.AV11prdpreact = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPPROPRV

      */
      A719PrdNum = AV8PrdNum ;
      A6158PrdPrv = AV10PrvNum ;
      A7240PrdPrea = AV11prdpreact ;
      /* Using cursor P02NX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv), A7240PrdPrea});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P02NX3 */
         pr_default.execute(1, new Object[] {AV11prdpreact, A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pproprvn");
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
      A7240PrdPrea = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pproprvn__default(),
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

   private short Gx_err ;
   private int AV10PrvNum ;
   private int GX_INS898 ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal AV11prdpreact ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String A719PrdNum ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class pproprvn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02NX2", "INSERT INTO TXPPROPRV(EmprCod, PrdNum, PrdPrv, PrdPrea, PrdRefn) VALUES(?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
         ,new UpdateCursor("P02NX3", "UPDATE TXPPROPRV SET PrdPrea=?  WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

