package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apchipro extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apchipro pgm = new apchipro (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apchipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apchipro.class ), "" );
   }

   public apchipro( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "REALIZANDO ACTUALIZACION", "") );
      /* Using cursor P00MO2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkMO2 = false ;
         A561HisProLin = P00MO2_A561HisProLin[0] ;
         A558HisProFec = P00MO2_A558HisProFec[0] ;
         A602MaqCod = P00MO2_A602MaqCod[0] ;
         A396EmprCod = P00MO2_A396EmprCod[0] ;
         A568HisProUni = P00MO2_A568HisProUni[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00MO2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00MO2_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P00MO2_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) )
         {
            brkMO2 = false ;
            A561HisProLin = P00MO2_A561HisProLin[0] ;
            AV8HisProULin = A561HisProLin ;
            brkMO2 = true ;
            pr_default.readNext(0);
         }
         /*
            INSERT RECORD ON TABLE TXPCHIPRO

         */
         W567HisProULin = A567HisProULin ;
         n567HisProULin = false ;
         A567HisProULin = AV8HisProULin ;
         n567HisProULin = false ;
         /* Using cursor P00MO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Boolean.valueOf(n567HisProULin), Integer.valueOf(A567HisProULin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
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
         A567HisProULin = W567HisProULin ;
         n567HisProULin = false ;
         /* End Insert */
         if ( ! brkMO2 )
         {
            brkMO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "PROCESO REALIZADO", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pchipro.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apchipro");
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
      P00MO2_A561HisProLin = new int[1] ;
      P00MO2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00MO2_A602MaqCod = new String[] {""} ;
      P00MO2_A396EmprCod = new String[] {""} ;
      P00MO2_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apchipro__default(),
         new Object[] {
             new Object[] {
            P00MO2_A561HisProLin, P00MO2_A558HisProFec, P00MO2_A602MaqCod, P00MO2_A396EmprCod, P00MO2_A568HisProUni
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A561HisProLin ;
   private int AV8HisProULin ;
   private int GX_INS58 ;
   private int W567HisProULin ;
   private int A567HisProULin ;
   private java.math.BigDecimal A568HisProUni ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private java.util.Date A558HisProFec ;
   private boolean brkMO2 ;
   private boolean n567HisProULin ;
   private IDataStoreProvider pr_default ;
   private int[] P00MO2_A561HisProLin ;
   private java.util.Date[] P00MO2_A558HisProFec ;
   private String[] P00MO2_A602MaqCod ;
   private String[] P00MO2_A396EmprCod ;
   private java.math.BigDecimal[] P00MO2_A568HisProUni ;
}

final  class apchipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MO2", "SELECT HisProLin, HisProFec, MaqCod, EmprCod, HisProUni FROM TXPLHIPRO ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00MO3", "INSERT INTO TXPCHIPRO(EmprCod, MaqCod, HisProFec, HisProULin) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCHIPRO")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
      }
   }

}

