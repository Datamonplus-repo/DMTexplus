package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultpza extends GXProcedure
{
   public pultpza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultpza.class ), "" );
   }

   public pultpza( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pultpza.this.aP2 = new String[] {""};
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
      pultpza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultpza.this.AV18AlbReccod = aP1[0];
      this.aP1 = aP1;
      pultpza.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Kgs = DecimalUtil.doubleToDec(0) ;
      GXv_int1[0] = AV11Si0 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NP0001", ""), GXv_int1) ;
      pultpza.this.AV11Si0 = GXv_int1[0] ;
      AV16Np = (short)(1) ;
      AV8UltPza = " " ;
      /* Using cursor P01FG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18AlbReccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P01FG2_A44AlbRecCod[0] ;
         A2159AlbRecPie = P01FG2_A2159AlbRecPie[0] ;
         AV8UltPza = A2159AlbRecPie ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9ContaPza = (int)(GXutil.lval( AV8UltPza)+1) ;
      if ( AV11Si0 == 0 )
      {
         AV8UltPza = GXutil.trim( GXutil.str( AV9ContaPza, 9, 0)) ;
      }
      else
      {
         if ( GXutil.strcmp(AV8UltPza, " ") == 0 )
         {
            AV13Nrecp6 = AV18AlbReccod ;
            AV14Nrecp6a = GXutil.padl( GXutil.trim( GXutil.str( AV13Nrecp6, 6, 0)), (short)(6), "0") ;
            AV15NpA = GXutil.padl( GXutil.trim( GXutil.str( AV16Np, 3, 0)), (short)(3), "0") ;
            AV17Npza = AV14Nrecp6a + AV15NpA ;
            AV8UltPza = AV17Npza ;
         }
         else
         {
            AV8UltPza = GXutil.padl( GXutil.trim( GXutil.str( AV9ContaPza, 9, 0)), (short)(9), "0") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultpza.this.A396EmprCod;
      this.aP1[0] = pultpza.this.AV18AlbReccod;
      this.aP2[0] = pultpza.this.AV8UltPza;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UltPza = "" ;
      AV19Kgs = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01FG2_A396EmprCod = new String[] {""} ;
      P01FG2_A44AlbRecCod = new int[1] ;
      P01FG2_A2159AlbRecPie = new String[] {""} ;
      A2159AlbRecPie = "" ;
      AV14Nrecp6a = "" ;
      AV15NpA = "" ;
      AV17Npza = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultpza__default(),
         new Object[] {
             new Object[] {
            P01FG2_A396EmprCod, P01FG2_A44AlbRecCod, P01FG2_A2159AlbRecPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Si0 ;
   private byte GXv_int1[] ;
   private short AV16Np ;
   private short Gx_err ;
   private int AV18AlbReccod ;
   private int A44AlbRecCod ;
   private int AV9ContaPza ;
   private int AV13Nrecp6 ;
   private java.math.BigDecimal AV19Kgs ;
   private String A396EmprCod ;
   private String AV8UltPza ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String AV14Nrecp6a ;
   private String AV15NpA ;
   private String AV17Npza ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FG2_A396EmprCod ;
   private int[] P01FG2_A44AlbRecCod ;
   private String[] P01FG2_A2159AlbRecPie ;
}

final  class pultpza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FG2", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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

