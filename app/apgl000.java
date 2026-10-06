package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apgl000 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apgl000 pgm = new apgl000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apgl000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apgl000.class ), "" );
   }

   public apgl000( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Inicio...Actualizo lb_fecent1....", "") );
      /* Using cursor P02MB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P02MB2_A5532Lb_numero[0] ;
         A396EmprCod = P02MB2_A396EmprCod[0] ;
         A5541Lb_FechaE = P02MB2_A5541Lb_FechaE[0] ;
         A5542Lb_HoraE = P02MB2_A5542Lb_HoraE[0] ;
         AV8LB_FECHAE = A5541Lb_FechaE ;
         AV9Lb_horae = A5542Lb_HoraE ;
         /* Using cursor P02MB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6461Lb_FecNoa1 = P02MB3_A6461Lb_FecNoa1[0] ;
            A6460Lb_FecEnt1 = P02MB3_A6460Lb_FecEnt1[0] ;
            A10081Lb_hhent1 = P02MB3_A10081Lb_hhent1[0] ;
            A5555Lb_opcion = P02MB3_A5555Lb_opcion[0] ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6460Lb_FecEnt1)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
            {
               A6460Lb_FecEnt1 = AV8LB_FECHAE ;
               A10081Lb_hhent1 = AV9Lb_horae ;
            }
            /* Using cursor P02MB4 */
            pr_default.execute(2, new Object[] {A6460Lb_FecEnt1, A10081Lb_hhent1, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin...Actualizo lb_fecent1....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pgl000.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apgl000");
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
      P02MB2_A5532Lb_numero = new int[1] ;
      P02MB2_A396EmprCod = new String[] {""} ;
      P02MB2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P02MB2_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      AV8LB_FECHAE = GXutil.nullDate() ;
      AV9Lb_horae = GXutil.resetTime( GXutil.nullDate() );
      P02MB3_A396EmprCod = new String[] {""} ;
      P02MB3_A5532Lb_numero = new int[1] ;
      P02MB3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02MB3_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02MB3_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02MB3_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      A5555Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apgl000__default(),
         new Object[] {
             new Object[] {
            P02MB2_A5532Lb_numero, P02MB2_A396EmprCod, P02MB2_A5541Lb_FechaE, P02MB2_A5542Lb_HoraE
            }
            , new Object[] {
            P02MB3_A396EmprCod, P02MB3_A5532Lb_numero, P02MB3_A6461Lb_FecNoa1, P02MB3_A6460Lb_FecEnt1, P02MB3_A10081Lb_hhent1, P02MB3_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV9Lb_horae ;
   private java.util.Date A10081Lb_hhent1 ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV8LB_FECHAE ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private IDataStoreProvider pr_default ;
   private int[] P02MB2_A5532Lb_numero ;
   private String[] P02MB2_A396EmprCod ;
   private java.util.Date[] P02MB2_A5541Lb_FechaE ;
   private java.util.Date[] P02MB2_A5542Lb_HoraE ;
   private String[] P02MB3_A396EmprCod ;
   private int[] P02MB3_A5532Lb_numero ;
   private java.util.Date[] P02MB3_A6461Lb_FecNoa1 ;
   private java.util.Date[] P02MB3_A6460Lb_FecEnt1 ;
   private java.util.Date[] P02MB3_A10081Lb_hhent1 ;
   private String[] P02MB3_A5555Lb_opcion ;
}

final  class apgl000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02MB2", "SELECT Lb_numero, EmprCod, Lb_FechaE, Lb_HoraE FROM TXPENS001 ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02MB3", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_FecEnt1, Lb_hhent1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02MB4", "UPDATE TXPENS002 SET Lb_FecEnt1=?, Lb_hhent1=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDateTime(2, (java.util.Date)parms[1], true);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

