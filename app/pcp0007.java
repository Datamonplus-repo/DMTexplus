package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcp0007 extends GXProcedure
{
   public pcp0007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcp0007.class ), "" );
   }

   public pcp0007( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 )
   {
      pcp0007.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pcp0007.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcp0007.this.AV13Clicod = aP1[0];
      this.aP1 = aP1;
      pcp0007.this.AV11Barcolnom = aP2[0];
      this.aP2 = aP2;
      pcp0007.this.AV10BarColNum = aP3[0];
      this.aP3 = aP3;
      pcp0007.this.AV14Bartipcol = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9MaqCodLas = "" ;
      AV12Recmaq = (byte)(0) ;
      /* Using cursor P02DY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(AV14Bartipcol), AV11Barcolnom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P02DY2_A129BarCod[0] ;
         A132BarCodReo = P02DY2_A132BarCodReo[0] ;
         A130BarCodPar = P02DY2_A130BarCodPar[0] ;
         A218BarTipCol = P02DY2_A218BarTipCol[0] ;
         A135BarColNom = P02DY2_A135BarColNom[0] ;
         A6039RecAcab = P02DY2_A6039RecAcab[0] ;
         n6039RecAcab = P02DY2_n6039RecAcab[0] ;
         A4700RecEnvio = P02DY2_A4700RecEnvio[0] ;
         A602MaqCod = P02DY2_A602MaqCod[0] ;
         A2804RecLinMaq = P02DY2_A2804RecLinMaq[0] ;
         A218BarTipCol = P02DY2_A218BarTipCol[0] ;
         A135BarColNom = P02DY2_A135BarColNom[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            if ( ( ( GXutil.strcmp(AV9MaqCodLas, "") == 0 ) ) || ( ( GXutil.strcmp(A602MaqCod, AV9MaqCodLas) != 0 ) && ! (GXutil.strcmp("", AV9MaqCodLas)==0) ) )
            {
               if ( AV12Recmaq == 0 )
               {
                  AV8Linea = httpContext.getMessage( "Atençao. Esta cor já esta planificado nas máquinas ", "") ;
                  AV8Linea += A602MaqCod + "-" ;
               }
               else
               {
                  AV8Linea += A602MaqCod + "-" ;
               }
               AV12Recmaq = (byte)(1) ;
            }
            AV9MaqCodLas = A602MaqCod ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12Recmaq == 1 )
      {
         AV8Linea = GXutil.trim( AV8Linea) ;
         httpContext.GX_msglist.addItem(AV8Linea);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcp0007.this.A396EmprCod;
      this.aP1[0] = pcp0007.this.AV13Clicod;
      this.aP2[0] = pcp0007.this.AV11Barcolnom;
      this.aP3[0] = pcp0007.this.AV10BarColNum;
      this.aP4[0] = pcp0007.this.AV14Bartipcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9MaqCodLas = "" ;
      scmdbuf = "" ;
      P02DY2_A129BarCod = new int[1] ;
      P02DY2_A132BarCodReo = new byte[1] ;
      P02DY2_A130BarCodPar = new String[] {""} ;
      P02DY2_A396EmprCod = new String[] {""} ;
      P02DY2_A218BarTipCol = new byte[1] ;
      P02DY2_A135BarColNom = new String[] {""} ;
      P02DY2_A6039RecAcab = new String[] {""} ;
      P02DY2_n6039RecAcab = new boolean[] {false} ;
      P02DY2_A4700RecEnvio = new byte[1] ;
      P02DY2_A602MaqCod = new String[] {""} ;
      P02DY2_A2804RecLinMaq = new short[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A6039RecAcab = "" ;
      A602MaqCod = "" ;
      AV8Linea = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcp0007__default(),
         new Object[] {
             new Object[] {
            P02DY2_A129BarCod, P02DY2_A132BarCodReo, P02DY2_A130BarCodPar, P02DY2_A396EmprCod, P02DY2_A218BarTipCol, P02DY2_A135BarColNom, P02DY2_A6039RecAcab, P02DY2_n6039RecAcab, P02DY2_A4700RecEnvio, P02DY2_A602MaqCod,
            P02DY2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Bartipcol ;
   private byte AV12Recmaq ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A4700RecEnvio ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13Clicod ;
   private int AV10BarColNum ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV11Barcolnom ;
   private String AV9MaqCodLas ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String AV8Linea ;
   private boolean n6039RecAcab ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P02DY2_A129BarCod ;
   private byte[] P02DY2_A132BarCodReo ;
   private String[] P02DY2_A130BarCodPar ;
   private String[] P02DY2_A396EmprCod ;
   private byte[] P02DY2_A218BarTipCol ;
   private String[] P02DY2_A135BarColNom ;
   private String[] P02DY2_A6039RecAcab ;
   private boolean[] P02DY2_n6039RecAcab ;
   private byte[] P02DY2_A4700RecEnvio ;
   private String[] P02DY2_A602MaqCod ;
   private short[] P02DY2_A2804RecLinMaq ;
}

final  class pcp0007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DY2", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T2.BarTipCol, T2.BarColNom, T1.RecAcab, T1.RecEnvio, T1.MaqCod, T1.RecLinMaq FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.RecEnvio > 0) AND (T2.BarTipCol = ?) AND (T2.BarColNom = ?) ORDER BY T1.EmprCod, T1.RecEnvio, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 13);
               return;
      }
   }

}

