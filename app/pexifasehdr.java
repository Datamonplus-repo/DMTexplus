package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexifasehdr extends GXProcedure
{
   public pexifasehdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexifasehdr.class ), "" );
   }

   public pexifasehdr( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pexifasehdr.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pexifasehdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexifasehdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pexifasehdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pexifasehdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pexifasehdr.this.AV8Fascod = aP4[0];
      this.aP4 = aP4;
      pexifasehdr.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      pexifasehdr.this.AV9Inc_obs = aP6[0];
      this.aP6 = aP6;
      pexifasehdr.this.AV10Nveces = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "NO Ok", "") ;
      AV9Inc_obs = "" ;
      AV10Nveces = (byte)(0) ;
      /* Using cursor P05R22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P05R22_A457FasCod[0] ;
         A153BarFasEst = P05R22_A153BarFasEst[0] ;
         A3298BarFecRIni = P05R22_A3298BarFecRIni[0] ;
         A460FasDsc = P05R22_A460FasDsc[0] ;
         A194BarOrdLin = P05R22_A194BarOrdLin[0] ;
         A758ProCod = P05R22_A758ProCod[0] ;
         A460FasDsc = P05R22_A460FasDsc[0] ;
         if ( GXutil.strcmp(A457FasCod, AV8Fascod) == 0 )
         {
            Gx_msg = httpContext.getMessage( "Ok", "") ;
            if ( A153BarFasEst > 0 )
            {
               AV9Inc_obs = httpContext.getMessage( "AVISO.#Orden ", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Fase ", "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + httpContext.getMessage( " Estado =", "") + GXutil.str( A153BarFasEst, 1, 0) + httpContext.getMessage( " Dia =", "") + localUtil.dtoc( A3298BarFecRIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            else
            {
               AV9Inc_obs = " " ;
            }
            AV10Nveces = (byte)(AV10Nveces+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexifasehdr.this.A396EmprCod;
      this.aP1[0] = pexifasehdr.this.A129BarCod;
      this.aP2[0] = pexifasehdr.this.A132BarCodReo;
      this.aP3[0] = pexifasehdr.this.A130BarCodPar;
      this.aP4[0] = pexifasehdr.this.AV8Fascod;
      this.aP5[0] = pexifasehdr.this.Gx_msg;
      this.aP6[0] = pexifasehdr.this.AV9Inc_obs;
      this.aP7[0] = pexifasehdr.this.AV10Nveces;
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
      P05R22_A396EmprCod = new String[] {""} ;
      P05R22_A129BarCod = new int[1] ;
      P05R22_A132BarCodReo = new byte[1] ;
      P05R22_A130BarCodPar = new String[] {""} ;
      P05R22_A457FasCod = new String[] {""} ;
      P05R22_A153BarFasEst = new byte[1] ;
      P05R22_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P05R22_A460FasDsc = new String[] {""} ;
      P05R22_A194BarOrdLin = new short[1] ;
      P05R22_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexifasehdr__default(),
         new Object[] {
             new Object[] {
            P05R22_A396EmprCod, P05R22_A129BarCod, P05R22_A132BarCodReo, P05R22_A130BarCodPar, P05R22_A457FasCod, P05R22_A153BarFasEst, P05R22_A3298BarFecRIni, P05R22_A460FasDsc, P05R22_A194BarOrdLin, P05R22_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV10Nveces ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Fascod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private java.util.Date A3298BarFecRIni ;
   private String AV9Inc_obs ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P05R22_A396EmprCod ;
   private int[] P05R22_A129BarCod ;
   private byte[] P05R22_A132BarCodReo ;
   private String[] P05R22_A130BarCodPar ;
   private String[] P05R22_A457FasCod ;
   private byte[] P05R22_A153BarFasEst ;
   private java.util.Date[] P05R22_A3298BarFecRIni ;
   private String[] P05R22_A460FasDsc ;
   private short[] P05R22_A194BarOrdLin ;
   private String[] P05R22_A758ProCod ;
}

final  class pexifasehdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05R22", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.BarFasEst, T1.BarFecRIni, T2.FasDsc, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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

