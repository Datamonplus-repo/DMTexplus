package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgtipctl extends GXProcedure
{
   public pgtipctl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgtipctl.class ), "" );
   }

   public pgtipctl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            String[] aP2 )
   {
      pgtipctl.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pgtipctl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgtipctl.this.A829TipArtCod = aP1[0];
      this.aP1 = aP1;
      pgtipctl.this.AV8Existe = aP2[0];
      this.aP2 = aP2;
      pgtipctl.this.AV9GrdTipArt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = httpContext.getMessage( "N", "") ;
      /* Using cursor P01A52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4364GrdTipArt = P01A52_A4364GrdTipArt[0] ;
         AV8Existe = httpContext.getMessage( "S", "") ;
         AV9GrdTipArt = A4364GrdTipArt ;
         pr_default.close(0);
         returnInSub = true;
         cleanup();
         if (true) return;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgtipctl.this.A396EmprCod;
      this.aP1[0] = pgtipctl.this.A829TipArtCod;
      this.aP2[0] = pgtipctl.this.AV8Existe;
      this.aP3[0] = pgtipctl.this.AV9GrdTipArt;
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
      P01A52_A396EmprCod = new String[] {""} ;
      P01A52_A829TipArtCod = new short[1] ;
      P01A52_A4364GrdTipArt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgtipctl__default(),
         new Object[] {
             new Object[] {
            P01A52_A396EmprCod, P01A52_A829TipArtCod, P01A52_A4364GrdTipArt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short AV9GrdTipArt ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Existe ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private short[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01A52_A396EmprCod ;
   private short[] P01A52_A829TipArtCod ;
   private short[] P01A52_A4364GrdTipArt ;
}

final  class pgtipctl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01A52", "SELECT * FROM (SELECT EmprCod, TipArtCod, GrdTipArt FROM TXPGRDTI1 WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

