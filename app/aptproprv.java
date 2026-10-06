package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptproprv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptproprv pgm = new aptproprv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptproprv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptproprv.class ), "" );
   }

   public aptproprv( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02UA2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P02UA2_A795PrvNum[0] ;
         A724PrdPreAct = P02UA2_A724PrdPreAct[0] ;
         A719PrdNum = P02UA2_A719PrdNum[0] ;
         A396EmprCod = P02UA2_A396EmprCod[0] ;
         AV8PrdNum = A719PrdNum ;
         AV9PrdPrv = A795PrvNum ;
         AV10emprcod = A396EmprCod ;
         AV11PrdPrea = A724PrdPreAct ;
         /* Execute user subroutine: 'PROPRV' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROPRV' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPPROPRV

      */
      A396EmprCod = AV10emprcod ;
      A719PrdNum = AV8PrdNum ;
      A6158PrdPrv = AV9PrdPrv ;
      A7240PrdPrea = AV11PrdPrea ;
      /* Using cursor P02UA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv), A7240PrdPrea});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
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
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptproprv.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptproprv");
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
      P02UA2_A795PrvNum = new int[1] ;
      P02UA2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02UA2_A719PrdNum = new String[] {""} ;
      P02UA2_A396EmprCod = new String[] {""} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      AV8PrdNum = "" ;
      AV10emprcod = "" ;
      AV11PrdPrea = DecimalUtil.ZERO ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptproprv__default(),
         new Object[] {
             new Object[] {
            P02UA2_A795PrvNum, P02UA2_A724PrdPreAct, P02UA2_A719PrdNum, P02UA2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A795PrvNum ;
   private int AV9PrdPrv ;
   private int GX_INS898 ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV11PrdPrea ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV10emprcod ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P02UA2_A795PrvNum ;
   private java.math.BigDecimal[] P02UA2_A724PrdPreAct ;
   private String[] P02UA2_A719PrdNum ;
   private String[] P02UA2_A396EmprCod ;
}

final  class aptproprv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UA2", "SELECT PrvNum, PrdPreAct, PrdNum, EmprCod FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02UA3", "INSERT INTO TXPPROPRV(EmprCod, PrdNum, PrdPrv, PrdPrea, PrdRefn) VALUES(?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
      }
   }

}

