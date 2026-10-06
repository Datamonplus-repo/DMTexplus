package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_datosproduc extends GXProcedure
{
   public get_datosproduc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_datosproduc.class ), "" );
   }

   public get_datosproduc( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      get_datosproduc.this.A396EmprCod = aP0;
      get_datosproduc.this.AV9PrdNum = aP1;
      get_datosproduc.this.AV8PrdNom = aP2;
      get_datosproduc.this.AV10PrdLote = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrdNom = "" ;
      AV10PrdLote = "" ;
      if ( ! (GXutil.strcmp("", AV9PrdNum)==0) )
      {
         AV13GXLvl5 = (byte)(0) ;
         /* Using cursor P0AL32 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV9PrdNum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P0AL32_A719PrdNum[0] ;
            A718PrdNom = P0AL32_A718PrdNom[0] ;
            A10881PrdLote = P0AL32_A10881PrdLote[0] ;
            AV13GXLvl5 = (byte)(1) ;
            AV8PrdNom = A718PrdNom ;
            AV10PrdLote = A10881PrdLote ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV13GXLvl5 == 0 )
         {
            AV8PrdNom = httpContext.getMessage( "Error", "") ;
         }
      }
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
      P0AL32_A396EmprCod = new String[] {""} ;
      P0AL32_A719PrdNum = new String[] {""} ;
      P0AL32_A718PrdNom = new String[] {""} ;
      P0AL32_A10881PrdLote = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A10881PrdLote = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.get_datosproduc__default(),
         new Object[] {
             new Object[] {
            P0AL32_A396EmprCod, P0AL32_A719PrdNum, P0AL32_A718PrdNom, P0AL32_A10881PrdLote
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl5 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9PrdNum ;
   private String AV8PrdNom ;
   private String AV10PrdLote ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A10881PrdLote ;
   private IDataStoreProvider pr_default ;
   private String[] P0AL32_A396EmprCod ;
   private String[] P0AL32_A719PrdNum ;
   private String[] P0AL32_A718PrdNom ;
   private String[] P0AL32_A10881PrdLote ;
}

final  class get_datosproduc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AL32", "SELECT EmprCod, PrdNum, PrdNom, PrdLote FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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
      }
   }

}

