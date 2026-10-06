package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactrestot extends GXProcedure
{
   public pactrestot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactrestot.class ), "" );
   }

   public pactrestot( int remoteHandle ,
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
      /* Using cursor P01XY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P01XY2_A718PrdNom[0] ;
         A719PrdNum = P01XY2_A719PrdNum[0] ;
         A396EmprCod = P01XY2_A396EmprCod[0] ;
         AV8Txt = httpContext.getMessage( "Recalculando reservas de ", "") + A719PrdNum + "-" + A718PrdNom ;
         System.out.println( Gx_msg );
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         new app.putil181(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
         pactrestot.this.A396EmprCod = GXv_char1[0] ;
         pactrestot.this.A719PrdNum = GXv_char2[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
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
      P01XY2_A718PrdNom = new String[] {""} ;
      P01XY2_A719PrdNum = new String[] {""} ;
      P01XY2_A396EmprCod = new String[] {""} ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      AV8Txt = "" ;
      Gx_msg = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactrestot__default(),
         new Object[] {
             new Object[] {
            P01XY2_A718PrdNom, P01XY2_A719PrdNum, P01XY2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV8Txt ;
   private String Gx_msg ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private IDataStoreProvider pr_default ;
   private String[] P01XY2_A718PrdNom ;
   private String[] P01XY2_A719PrdNum ;
   private String[] P01XY2_A396EmprCod ;
}

final  class pactrestot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XY2", "SELECT PrdNom, PrdNum, EmprCod FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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

