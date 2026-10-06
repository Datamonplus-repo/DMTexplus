package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputifmin extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputifmin pgm = new aputifmin (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputifmin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputifmin.class ), "" );
   }

   public aputifmin( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Proceso iniciado...", "") );
      AV8Cont = 0 ;
      /* Using cursor P02J72 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P02J72_A213BarSit[0] ;
         A120BarAgrEst = P02J72_A120BarAgrEst[0] ;
         A396EmprCod = P02J72_A396EmprCod[0] ;
         A130BarCodPar = P02J72_A130BarCodPar[0] ;
         A132BarCodReo = P02J72_A132BarCodReo[0] ;
         A129BarCod = P02J72_A129BarCod[0] ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8Cont = (int)(AV8Cont+1) ;
            AV9Conver = GXutil.str( AV8Cont, 6, 0) ;
            System.out.println( AV9Conver );
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            new app.pcremag(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            aputifmin.this.A396EmprCod = GXv_char1[0] ;
            aputifmin.this.A129BarCod = GXv_int2[0] ;
            aputifmin.this.A132BarCodReo = GXv_int3[0] ;
            aputifmin.this.A130BarCodPar = GXv_char4[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putifmin.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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
      P02J72_A213BarSit = new byte[1] ;
      P02J72_A120BarAgrEst = new String[] {""} ;
      P02J72_A396EmprCod = new String[] {""} ;
      P02J72_A130BarCodPar = new String[] {""} ;
      P02J72_A132BarCodReo = new byte[1] ;
      P02J72_A129BarCod = new int[1] ;
      A120BarAgrEst = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV9Conver = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputifmin__default(),
         new Object[] {
             new Object[] {
            P02J72_A213BarSit, P02J72_A120BarAgrEst, P02J72_A396EmprCod, P02J72_A130BarCodPar, P02J72_A132BarCodReo, P02J72_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV8Cont ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Conver ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private IDataStoreProvider pr_default ;
   private byte[] P02J72_A213BarSit ;
   private String[] P02J72_A120BarAgrEst ;
   private String[] P02J72_A396EmprCod ;
   private String[] P02J72_A130BarCodPar ;
   private byte[] P02J72_A132BarCodReo ;
   private int[] P02J72_A129BarCod ;
}

final  class aputifmin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02J72", "SELECT BarSit, BarAgrEst, EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarSit < 9) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

