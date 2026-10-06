package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnrcope extends GXProcedure
{
   public pnrcope( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnrcope.class ), "" );
   }

   public pnrcope( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pnrcope.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pnrcope.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnrcope.this.A652OpeCod = aP1[0];
      this.aP1 = aP1;
      pnrcope.this.AV17OPENOM = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20GXLvl3 = (byte)(0) ;
      /* Using cursor P021N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A653OpeNom = P021N2_A653OpeNom[0] ;
         n653OpeNom = P021N2_n653OpeNom[0] ;
         AV20GXLvl3 = (byte)(1) ;
         AV17OPENOM = A653OpeNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV20GXLvl3 == 0 )
      {
         AV17OPENOM = ((A652OpeCod>0) ? httpContext.getMessage( "Inexistente", "") : " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnrcope.this.A396EmprCod;
      this.aP1[0] = pnrcope.this.A652OpeCod;
      this.aP2[0] = pnrcope.this.AV17OPENOM;
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
      P021N2_A396EmprCod = new String[] {""} ;
      P021N2_A652OpeCod = new int[1] ;
      P021N2_A653OpeNom = new String[] {""} ;
      P021N2_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnrcope__default(),
         new Object[] {
             new Object[] {
            P021N2_A396EmprCod, P021N2_A652OpeCod, P021N2_A653OpeNom, P021N2_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl3 ;
   private short Gx_err ;
   private int A652OpeCod ;
   private String A396EmprCod ;
   private String AV17OPENOM ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private boolean n653OpeNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P021N2_A396EmprCod ;
   private int[] P021N2_A652OpeCod ;
   private String[] P021N2_A653OpeNom ;
   private boolean[] P021N2_n653OpeNom ;
}

final  class pnrcope__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021N2", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
      }
   }

}

