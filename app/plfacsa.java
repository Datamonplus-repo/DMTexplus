package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plfacsa extends GXProcedure
{
   public plfacsa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plfacsa.class ), "" );
   }

   public plfacsa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      plfacsa.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      plfacsa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plfacsa.this.A2971SabFacCod = aP1[0];
      this.aP1 = aP1;
      plfacsa.this.AV9SabFacLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9SabFacLin = (short)(0) ;
      /* Using cursor P00QD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2971SabFacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2985SabFacLin = P00QD2_A2985SabFacLin[0] ;
         AV9SabFacLin = A2985SabFacLin ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9SabFacLin = (short)(AV9SabFacLin+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plfacsa.this.A396EmprCod;
      this.aP1[0] = plfacsa.this.A2971SabFacCod;
      this.aP2[0] = plfacsa.this.AV9SabFacLin;
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
      P00QD2_A396EmprCod = new String[] {""} ;
      P00QD2_A2971SabFacCod = new int[1] ;
      P00QD2_A2985SabFacLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plfacsa__default(),
         new Object[] {
             new Object[] {
            P00QD2_A396EmprCod, P00QD2_A2971SabFacCod, P00QD2_A2985SabFacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9SabFacLin ;
   private short A2985SabFacLin ;
   private short Gx_err ;
   private int A2971SabFacCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00QD2_A396EmprCod ;
   private int[] P00QD2_A2971SabFacCod ;
   private short[] P00QD2_A2985SabFacLin ;
}

final  class plfacsa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00QD2", "SELECT EmprCod, SabFacCod, SabFacLin FROM TXPLFACSA WHERE EmprCod = ? and SabFacCod = ? ORDER BY EmprCod, SabFacCod, SabFacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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

