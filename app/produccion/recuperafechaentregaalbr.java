package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperafechaentregaalbr extends GXProcedure
{
   public recuperafechaentregaalbr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperafechaentregaalbr.class ), "" );
   }

   public recuperafechaentregaalbr( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 ,
                                     byte aP2 ,
                                     String aP3 )
   {
      recuperafechaentregaalbr.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.util.Date[] aP4 )
   {
      recuperafechaentregaalbr.this.A396EmprCod = aP0;
      recuperafechaentregaalbr.this.A129BarCod = aP1;
      recuperafechaentregaalbr.this.A132BarCodReo = aP2;
      recuperafechaentregaalbr.this.A130BarCodPar = aP3;
      recuperafechaentregaalbr.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9AlbrEnt = "" ;
      /* Using cursor P09ZP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9ZP2 = false ;
         A44AlbRecCod = P09ZP2_A44AlbRecCod[0] ;
         A203BarPieKil = P09ZP2_A203BarPieKil[0] ;
         A49AlbRFen = P09ZP2_A49AlbRFen[0] ;
         A200BarPieCod = P09ZP2_A200BarPieCod[0] ;
         A49AlbRFen = P09ZP2_A49AlbRFen[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09ZP2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09ZP2_A129BarCod[0] == A129BarCod ) && ( P09ZP2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09ZP2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09ZP2_A44AlbRecCod[0] == A44AlbRecCod ) ) )
            {
               if (true) break;
            }
            brk9ZP2 = false ;
            A203BarPieKil = P09ZP2_A203BarPieKil[0] ;
            A49AlbRFen = P09ZP2_A49AlbRFen[0] ;
            A200BarPieCod = P09ZP2_A200BarPieCod[0] ;
            A49AlbRFen = P09ZP2_A49AlbRFen[0] ;
            AV10AlbRFen = A49AlbRFen ;
            brk9ZP2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk9ZP2 )
         {
            brk9ZP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = recuperafechaentregaalbr.this.AV10AlbRFen;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10AlbRFen = GXutil.nullDate() ;
      AV9AlbrEnt = "" ;
      scmdbuf = "" ;
      P09ZP2_A396EmprCod = new String[] {""} ;
      P09ZP2_A129BarCod = new int[1] ;
      P09ZP2_A132BarCodReo = new byte[1] ;
      P09ZP2_A130BarCodPar = new String[] {""} ;
      P09ZP2_A44AlbRecCod = new int[1] ;
      P09ZP2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZP2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZP2_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.recuperafechaentregaalbr__default(),
         new Object[] {
             new Object[] {
            P09ZP2_A396EmprCod, P09ZP2_A129BarCod, P09ZP2_A132BarCodReo, P09ZP2_A130BarCodPar, P09ZP2_A44AlbRecCod, P09ZP2_A203BarPieKil, P09ZP2_A49AlbRFen, P09ZP2_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9AlbrEnt ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private java.util.Date AV10AlbRFen ;
   private java.util.Date A49AlbRFen ;
   private boolean brk9ZP2 ;
   private java.util.Date[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZP2_A396EmprCod ;
   private int[] P09ZP2_A129BarCod ;
   private byte[] P09ZP2_A132BarCodReo ;
   private String[] P09ZP2_A130BarCodPar ;
   private int[] P09ZP2_A44AlbRecCod ;
   private java.math.BigDecimal[] P09ZP2_A203BarPieKil ;
   private java.util.Date[] P09ZP2_A49AlbRFen ;
   private String[] P09ZP2_A200BarPieCod ;
}

final  class recuperafechaentregaalbr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZP2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T1.BarPieKil, T2.AlbRFen, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

