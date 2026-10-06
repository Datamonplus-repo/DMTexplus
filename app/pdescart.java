package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdescart extends GXProcedure
{
   public pdescart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdescart.class ), "" );
   }

   public pdescart( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pdescart.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pdescart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdescart.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdescart.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pdescart.this.AV10Procod = aP3[0];
      this.aP3 = aP3;
      pdescart.this.AV9Art_Dsc = aP4[0];
      this.aP4 = aP4;
      pdescart.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P03F02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8165Art_Dsc = P03F02_A8165Art_Dsc[0] ;
         n8165Art_Dsc = P03F02_n8165Art_Dsc[0] ;
         A69ArtDsc = P03F02_A69ArtDsc[0] ;
         n69ArtDsc = P03F02_n69ArtDsc[0] ;
         A758ProCod = P03F02_A758ProCod[0] ;
         A69ArtDsc = P03F02_A69ArtDsc[0] ;
         n69ArtDsc = P03F02_n69ArtDsc[0] ;
         if ( ( GXutil.strcmp(AV9Art_Dsc, A8165Art_Dsc) == 0 ) && ( GXutil.strcmp(A758ProCod, AV10Procod) != 0 ) )
         {
            Gx_msg = httpContext.getMessage( "Atencion, la descripcion ", "") + GXutil.trim( A69ArtDsc) + " " + httpContext.getMessage( " existe para el proceso =", "") + A758ProCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdescart.this.A396EmprCod;
      this.aP1[0] = pdescart.this.A252CliCod;
      this.aP2[0] = pdescart.this.A65ArtCod;
      this.aP3[0] = pdescart.this.AV10Procod;
      this.aP4[0] = pdescart.this.AV9Art_Dsc;
      this.aP5[0] = pdescart.this.Gx_msg;
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
      P03F02_A396EmprCod = new String[] {""} ;
      P03F02_A252CliCod = new int[1] ;
      P03F02_A65ArtCod = new String[] {""} ;
      P03F02_A8165Art_Dsc = new String[] {""} ;
      P03F02_n8165Art_Dsc = new boolean[] {false} ;
      P03F02_A69ArtDsc = new String[] {""} ;
      P03F02_n69ArtDsc = new boolean[] {false} ;
      P03F02_A758ProCod = new String[] {""} ;
      A8165Art_Dsc = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdescart__default(),
         new Object[] {
             new Object[] {
            P03F02_A396EmprCod, P03F02_A252CliCod, P03F02_A65ArtCod, P03F02_A8165Art_Dsc, P03F02_n8165Art_Dsc, P03F02_A69ArtDsc, P03F02_n69ArtDsc, P03F02_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV10Procod ;
   private String AV9Art_Dsc ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A8165Art_Dsc ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private boolean n8165Art_Dsc ;
   private boolean n69ArtDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03F02_A396EmprCod ;
   private int[] P03F02_A252CliCod ;
   private String[] P03F02_A65ArtCod ;
   private String[] P03F02_A8165Art_Dsc ;
   private boolean[] P03F02_n8165Art_Dsc ;
   private String[] P03F02_A69ArtDsc ;
   private boolean[] P03F02_n69ArtDsc ;
   private String[] P03F02_A758ProCod ;
}

final  class pdescart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03F02", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Art_Dsc, T2.ArtDsc, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPARTICU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

