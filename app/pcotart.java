package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcotart extends GXProcedure
{
   public pcotart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcotart.class ), "" );
   }

   public pcotart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pcotart.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pcotart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcotart.this.AV14ArtCod = aP1[0];
      this.aP1 = aP1;
      pcotart.this.AV15TipARtDsc = aP2[0];
      this.aP2 = aP2;
      pcotart.this.AV17Flag = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV18Ibatex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IBATEX", ""), GXv_int2) ;
      pcotart.this.GXt_int1 = GXv_int2[0] ;
      AV18Ibatex = GXt_int1 ;
      AV16TipArtCod = (short)(GXutil.lval( GXutil.substring( AV14ArtCod, 1, 4))) ;
      AV15TipARtDsc = GXutil.space( (short)(30)) ;
      AV17Flag = (byte)(0) ;
      if ( ( AV16TipArtCod == 0 ) && ( AV18Ibatex == 1 ) )
      {
         AV17Flag = (byte)(1) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01AQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV16TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = P01AQ2_A829TipArtCod[0] ;
         A830TipArtDsc = P01AQ2_A830TipArtDsc[0] ;
         n830TipArtDsc = P01AQ2_n830TipArtDsc[0] ;
         AV17Flag = (byte)(1) ;
         AV15TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcotart.this.A396EmprCod;
      this.aP1[0] = pcotart.this.AV14ArtCod;
      this.aP2[0] = pcotart.this.AV15TipARtDsc;
      this.aP3[0] = pcotart.this.AV17Flag;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P01AQ2_A396EmprCod = new String[] {""} ;
      P01AQ2_A829TipArtCod = new short[1] ;
      P01AQ2_A830TipArtDsc = new String[] {""} ;
      P01AQ2_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcotart__default(),
         new Object[] {
             new Object[] {
            P01AQ2_A396EmprCod, P01AQ2_A829TipArtCod, P01AQ2_A830TipArtDsc, P01AQ2_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private byte AV18Ibatex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV16TipArtCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV14ArtCod ;
   private String AV15TipARtDsc ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private boolean returnInSub ;
   private boolean n830TipArtDsc ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AQ2_A396EmprCod ;
   private short[] P01AQ2_A829TipArtCod ;
   private String[] P01AQ2_A830TipArtDsc ;
   private boolean[] P01AQ2_n830TipArtDsc ;
}

final  class pcotart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AQ2", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

