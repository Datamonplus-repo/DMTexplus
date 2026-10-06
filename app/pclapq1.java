package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclapq1 extends GXProcedure
{
   public pclapq1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclapq1.class ), "" );
   }

   public pclapq1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      pclapq1.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pclapq1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclapq1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pclapq1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pclapq1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pclapq1.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pclapq1.this.AV120OrdLin = aP5[0];
      this.aP5 = aP5;
      pclapq1.this.AV121Clave_pq = aP6[0];
      this.aP6 = aP6;
      pclapq1.this.AV122Proceso_q = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV121Clave_pq = "" ;
      /* Using cursor P027L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P027L2_A457FasCod[0] ;
         A5369BarFasGral = P027L2_A5369BarFasGral[0] ;
         n5369BarFasGral = P027L2_n5369BarFasGral[0] ;
         A194BarOrdLin = P027L2_A194BarOrdLin[0] ;
         if ( A194BarOrdLin != AV120OrdLin )
         {
            AV18BarCod = A129BarCod ;
            AV19BarCodReo = A132BarCodReo ;
            AV20BarCodPar = A130BarCodPar ;
            AV100ProCod = A758ProCod ;
            AV112BarOrdLin = A194BarOrdLin ;
            AV113FasCod = A457FasCod ;
            if ( GXutil.strcmp(A5369BarFasGral, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'FASQUI' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV17PrdVal == 1 )
               {
                  AV121Clave_pq = httpContext.getMessage( "S", "") ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            else
            {
               /* Execute user subroutine: 'FASPR1' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV116i = (short)(1) ;
               while ( ! (GXutil.strcmp("", AV115Tab_pq[AV116i-1])==0) )
               {
                  if ( GXutil.strcmp(AV39Proceso, AV115Tab_pq[AV116i-1]) == 0 )
                  {
                     AV17PrdVal = (byte)(1) ;
                     AV121Clave_pq = httpContext.getMessage( "S", "") ;
                     if (true) break;
                  }
                  AV116i = (short)(AV116i+1) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV115Tab_pq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P027L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV113FasCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P027L3_A457FasCod[0] ;
         A6017FasClave = P027L3_A6017FasClave[0] ;
         n6017FasClave = P027L3_n6017FasClave[0] ;
         A764ProForCod = P027L3_A764ProForCod[0] ;
         A4650FasForLin = P027L3_A4650FasForLin[0] ;
         if ( (GXutil.strcmp("", A6017FasClave)==0) )
         {
            AV116i = (short)(AV116i+1) ;
            AV115Tab_pq[AV116i-1] = A764ProForCod ;
            Gx_msg = httpContext.getMessage( "Sin Clave,&Tab_pq()=", "") + AV115Tab_pq[AV116i-1] + GXutil.newLine( ) ;
         }
         else
         {
            AV114Flag_Clv_f = (byte)(0) ;
            AV117Accionf = "" ;
            if ( GXutil.strcmp(GXutil.substring( A6017FasClave, 1, 2), httpContext.getMessage( "PR", "")) == 0 )
            {
               AV117Accionf = GXutil.substring( A6017FasClave, 11, 1) ;
               AV39Proceso = GXutil.substring( A6017FasClave, 4, 6) ;
               if ( GXutil.strcmp(AV39Proceso, A764ProForCod) == 0 )
               {
                  AV114Flag_Clv_f = (byte)(1) ;
               }
               if ( AV114Flag_Clv_f == 1 )
               {
                  AV116i = (short)(AV116i+1) ;
                  AV115Tab_pq[AV116i-1] = A764ProForCod ;
                  if ( ( GXutil.strcmp(AV117Accionf, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV117Accionf, httpContext.getMessage( "E", "")) == 0 ) )
                  {
                     AV119i_ant = (short)(AV116i-1) ;
                     if ( AV119i_ant > 0 )
                     {
                        AV115Tab_pq[AV119i_ant-1] = "X" ;
                        Gx_msg = httpContext.getMessage( "&Tab_pq()=", "") + AV115Tab_pq[AV119i_ant-1] + GXutil.newLine( ) ;
                     }
                  }
                  Gx_msg = httpContext.getMessage( "&Accionf =", "") + AV117Accionf + GXutil.newLine( ) + httpContext.getMessage( "&i       =", "") + GXutil.str( AV116i, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Tab_pq()=", "") + AV115Tab_pq[AV116i-1] + GXutil.newLine( ) ;
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      /* Using cursor P027L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV100ProCod, Short.valueOf(AV112BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P027L4_A194BarOrdLin[0] ;
         A764ProForCod = P027L4_A764ProForCod[0] ;
         A5371FasQuiLin = P027L4_A5371FasQuiLin[0] ;
         if ( GXutil.strcmp(A764ProForCod, AV122Proceso_q) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
            AV121Clave_pq = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclapq1.this.A396EmprCod;
      this.aP1[0] = pclapq1.this.A129BarCod;
      this.aP2[0] = pclapq1.this.A132BarCodReo;
      this.aP3[0] = pclapq1.this.A130BarCodPar;
      this.aP4[0] = pclapq1.this.A758ProCod;
      this.aP5[0] = pclapq1.this.AV120OrdLin;
      this.aP6[0] = pclapq1.this.AV121Clave_pq;
      this.aP7[0] = pclapq1.this.AV122Proceso_q;
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
      P027L2_A396EmprCod = new String[] {""} ;
      P027L2_A129BarCod = new int[1] ;
      P027L2_A132BarCodReo = new byte[1] ;
      P027L2_A130BarCodPar = new String[] {""} ;
      P027L2_A758ProCod = new String[] {""} ;
      P027L2_A457FasCod = new String[] {""} ;
      P027L2_A5369BarFasGral = new String[] {""} ;
      P027L2_n5369BarFasGral = new boolean[] {false} ;
      P027L2_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A5369BarFasGral = "" ;
      AV20BarCodPar = "" ;
      AV100ProCod = "" ;
      AV113FasCod = "" ;
      AV115Tab_pq = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV115Tab_pq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV39Proceso = "" ;
      P027L3_A396EmprCod = new String[] {""} ;
      P027L3_A457FasCod = new String[] {""} ;
      P027L3_A6017FasClave = new String[] {""} ;
      P027L3_n6017FasClave = new boolean[] {false} ;
      P027L3_A764ProForCod = new String[] {""} ;
      P027L3_A4650FasForLin = new short[1] ;
      A6017FasClave = "" ;
      A764ProForCod = "" ;
      Gx_msg = "" ;
      AV117Accionf = "" ;
      P027L4_A396EmprCod = new String[] {""} ;
      P027L4_A194BarOrdLin = new short[1] ;
      P027L4_A758ProCod = new String[] {""} ;
      P027L4_A130BarCodPar = new String[] {""} ;
      P027L4_A132BarCodReo = new byte[1] ;
      P027L4_A129BarCod = new int[1] ;
      P027L4_A764ProForCod = new String[] {""} ;
      P027L4_A5371FasQuiLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclapq1__default(),
         new Object[] {
             new Object[] {
            P027L2_A396EmprCod, P027L2_A129BarCod, P027L2_A132BarCodReo, P027L2_A130BarCodPar, P027L2_A758ProCod, P027L2_A457FasCod, P027L2_A5369BarFasGral, P027L2_n5369BarFasGral, P027L2_A194BarOrdLin
            }
            , new Object[] {
            P027L3_A396EmprCod, P027L3_A457FasCod, P027L3_A6017FasClave, P027L3_n6017FasClave, P027L3_A764ProForCod, P027L3_A4650FasForLin
            }
            , new Object[] {
            P027L4_A396EmprCod, P027L4_A194BarOrdLin, P027L4_A758ProCod, P027L4_A130BarCodPar, P027L4_A132BarCodReo, P027L4_A129BarCod, P027L4_A764ProForCod, P027L4_A5371FasQuiLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV19BarCodReo ;
   private byte AV17PrdVal ;
   private byte AV114Flag_Clv_f ;
   private short AV120OrdLin ;
   private short A194BarOrdLin ;
   private short AV112BarOrdLin ;
   private short AV116i ;
   private short A4650FasForLin ;
   private short AV119i_ant ;
   private short A5371FasQuiLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV18BarCod ;
   private int GX_I ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV121Clave_pq ;
   private String AV122Proceso_q ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A5369BarFasGral ;
   private String AV20BarCodPar ;
   private String AV100ProCod ;
   private String AV113FasCod ;
   private String AV115Tab_pq[] ;
   private String AV39Proceso ;
   private String A6017FasClave ;
   private String A764ProForCod ;
   private String Gx_msg ;
   private String AV117Accionf ;
   private boolean n5369BarFasGral ;
   private boolean returnInSub ;
   private boolean n6017FasClave ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P027L2_A396EmprCod ;
   private int[] P027L2_A129BarCod ;
   private byte[] P027L2_A132BarCodReo ;
   private String[] P027L2_A130BarCodPar ;
   private String[] P027L2_A758ProCod ;
   private String[] P027L2_A457FasCod ;
   private String[] P027L2_A5369BarFasGral ;
   private boolean[] P027L2_n5369BarFasGral ;
   private short[] P027L2_A194BarOrdLin ;
   private String[] P027L3_A396EmprCod ;
   private String[] P027L3_A457FasCod ;
   private String[] P027L3_A6017FasClave ;
   private boolean[] P027L3_n6017FasClave ;
   private String[] P027L3_A764ProForCod ;
   private short[] P027L3_A4650FasForLin ;
   private String[] P027L4_A396EmprCod ;
   private short[] P027L4_A194BarOrdLin ;
   private String[] P027L4_A758ProCod ;
   private String[] P027L4_A130BarCodPar ;
   private byte[] P027L4_A132BarCodReo ;
   private int[] P027L4_A129BarCod ;
   private String[] P027L4_A764ProForCod ;
   private short[] P027L4_A5371FasQuiLin ;
}

final  class pclapq1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027L2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, BarFasGral, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P027L3", "SELECT EmprCod, FasCod, FasClave, ProForCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P027L4", "SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

