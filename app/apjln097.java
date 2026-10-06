package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln097 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln097 pgm = new apjln097 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln097( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln097.class ), "" );
   }

   public apjln097( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      /* Using cursor P029Z2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P029Z2_A795PrvNum[0] ;
         A724PrdPreAct = P029Z2_A724PrdPreAct[0] ;
         A719PrdNum = P029Z2_A719PrdNum[0] ;
         A396EmprCod = P029Z2_A396EmprCod[0] ;
         AV8LenVar = GXutil.len( A719PrdNum) ;
         if ( AV8LenVar >= 5 )
         {
            /*
               INSERT RECORD ON TABLE TXPPROPRV

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            A6158PrdPrv = A795PrvNum ;
            A7240PrdPrea = A724PrdPreAct ;
            /* Using cursor P029Z3 */
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
            A396EmprCod = W396EmprCod ;
            A719PrdNum = W719PrdNum ;
            /* End Insert */
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln097.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln097");
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
      P029Z2_A795PrvNum = new int[1] ;
      P029Z2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029Z2_A719PrdNum = new String[] {""} ;
      P029Z2_A396EmprCod = new String[] {""} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln097__default(),
         new Object[] {
             new Object[] {
            P029Z2_A795PrvNum, P029Z2_A724PrdPreAct, P029Z2_A719PrdNum, P029Z2_A396EmprCod
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
   private int AV8LenVar ;
   private int GX_INS898 ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private int[] P029Z2_A795PrvNum ;
   private java.math.BigDecimal[] P029Z2_A724PrdPreAct ;
   private String[] P029Z2_A719PrdNum ;
   private String[] P029Z2_A396EmprCod ;
}

final  class apjln097__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029Z2", "SELECT PrvNum, PrdPreAct, PrdNum, EmprCod FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P029Z3", "INSERT INTO TXPPROPRV(EmprCod, PrdNum, PrdPrv, PrdPrea, PrdRefn) VALUES(?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
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

