package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperalocalizacionalbr extends GXProcedure
{
   public recuperalocalizacionalbr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperalocalizacionalbr.class ), "" );
   }

   public recuperalocalizacionalbr( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      recuperalocalizacionalbr.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      recuperalocalizacionalbr.this.A396EmprCod = aP0;
      recuperalocalizacionalbr.this.A129BarCod = aP1;
      recuperalocalizacionalbr.this.A132BarCodReo = aP2;
      recuperalocalizacionalbr.this.A130BarCodPar = aP3;
      recuperalocalizacionalbr.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlbRloc = "" ;
      /* Using cursor P09ZM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9ZM2 = false ;
         A44AlbRecCod = P09ZM2_A44AlbRecCod[0] ;
         A203BarPieKil = P09ZM2_A203BarPieKil[0] ;
         A50AlbRLoc = P09ZM2_A50AlbRLoc[0] ;
         A200BarPieCod = P09ZM2_A200BarPieCod[0] ;
         A50AlbRLoc = P09ZM2_A50AlbRLoc[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09ZM2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09ZM2_A129BarCod[0] == A129BarCod ) && ( P09ZM2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09ZM2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09ZM2_A44AlbRecCod[0] == A44AlbRecCod ) ) )
            {
               if (true) break;
            }
            brk9ZM2 = false ;
            A203BarPieKil = P09ZM2_A203BarPieKil[0] ;
            A50AlbRLoc = P09ZM2_A50AlbRLoc[0] ;
            A200BarPieCod = P09ZM2_A200BarPieCod[0] ;
            A50AlbRLoc = P09ZM2_A50AlbRLoc[0] ;
            AV8AlbRloc = A50AlbRLoc ;
            brk9ZM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk9ZM2 )
         {
            brk9ZM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = recuperalocalizacionalbr.this.AV8AlbRloc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8AlbRloc = "" ;
      scmdbuf = "" ;
      P09ZM2_A396EmprCod = new String[] {""} ;
      P09ZM2_A129BarCod = new int[1] ;
      P09ZM2_A132BarCodReo = new byte[1] ;
      P09ZM2_A130BarCodPar = new String[] {""} ;
      P09ZM2_A44AlbRecCod = new int[1] ;
      P09ZM2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZM2_A50AlbRLoc = new String[] {""} ;
      P09ZM2_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.recuperalocalizacionalbr__default(),
         new Object[] {
             new Object[] {
            P09ZM2_A396EmprCod, P09ZM2_A129BarCod, P09ZM2_A132BarCodReo, P09ZM2_A130BarCodPar, P09ZM2_A44AlbRecCod, P09ZM2_A203BarPieKil, P09ZM2_A50AlbRLoc, P09ZM2_A200BarPieCod
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
   private String AV8AlbRloc ;
   private String scmdbuf ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private boolean brk9ZM2 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZM2_A396EmprCod ;
   private int[] P09ZM2_A129BarCod ;
   private byte[] P09ZM2_A132BarCodReo ;
   private String[] P09ZM2_A130BarCodPar ;
   private int[] P09ZM2_A44AlbRecCod ;
   private java.math.BigDecimal[] P09ZM2_A203BarPieKil ;
   private String[] P09ZM2_A50AlbRLoc ;
   private String[] P09ZM2_A200BarPieCod ;
}

final  class recuperalocalizacionalbr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZM2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T1.BarPieKil, T2.AlbRLoc, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
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

