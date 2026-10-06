package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfamdsc extends GXProcedure
{
   public pfamdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfamdsc.class ), "" );
   }

   public pfamdsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pfamdsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pfamdsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfamdsc.this.A4364GrdTipArt = aP1[0];
      this.aP1 = aP1;
      pfamdsc.this.AV8GrdTipDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8GrdTipDsc = "" ;
      /* Using cursor P01YN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4368GrdTipDsc = P01YN2_A4368GrdTipDsc[0] ;
         AV8GrdTipDsc = A4368GrdTipDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfamdsc.this.A396EmprCod;
      this.aP1[0] = pfamdsc.this.A4364GrdTipArt;
      this.aP2[0] = pfamdsc.this.AV8GrdTipDsc;
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
      P01YN2_A396EmprCod = new String[] {""} ;
      P01YN2_A4364GrdTipArt = new short[1] ;
      P01YN2_A4368GrdTipDsc = new String[] {""} ;
      A4368GrdTipDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfamdsc__default(),
         new Object[] {
             new Object[] {
            P01YN2_A396EmprCod, P01YN2_A4364GrdTipArt, P01YN2_A4368GrdTipDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8GrdTipDsc ;
   private String scmdbuf ;
   private String A4368GrdTipDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YN2_A396EmprCod ;
   private short[] P01YN2_A4364GrdTipArt ;
   private String[] P01YN2_A4368GrdTipDsc ;
}

final  class pfamdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YN2", "SELECT EmprCod, GrdTipArt, GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

