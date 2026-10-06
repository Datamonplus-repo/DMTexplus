package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclamqtp extends GXProcedure
{
   public pclamqtp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclamqtp.class ), "" );
   }

   public pclamqtp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pclamqtp.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pclamqtp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclamqtp.this.AV11Descrip = aP1[0];
      this.aP1 = aP1;
      pclamqtp.this.AV12Clave = aP2[0];
      this.aP2 = aP2;
      pclamqtp.this.AV27PrdVal = aP3[0];
      this.aP3 = aP3;
      pclamqtp.this.AV13BarCod = aP4[0];
      this.aP4 = aP4;
      pclamqtp.this.AV14BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclamqtp.this.AV15BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclamqtp.this.AV21BarLinMaq = aP7[0];
      this.aP7 = aP7;
      pclamqtp.this.AV16Accion = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27PrdVal = (byte)(0) ;
      AV25FMaq = (byte)(0) ;
      AV26FPeca = (byte)(0) ;
      AV17CodMaq = GXutil.rtrim( GXutil.substring( AV12Clave, 5, 6)) ;
      AV23TPeca = (short)(GXutil.lval( GXutil.trim( GXutil.substring( AV12Clave, 12, 4)))) ;
      AV16Accion = GXutil.substring( AV12Clave, 17, 1) ;
      /* Using cursor P02IT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, Short.valueOf(AV21BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02IT2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02IT2_A130BarCodPar[0] ;
         A132BarCodReo = P02IT2_A132BarCodReo[0] ;
         A129BarCod = P02IT2_A129BarCod[0] ;
         A602MaqCod = P02IT2_A602MaqCod[0] ;
         if ( GXutil.like( A602MaqCod , GXutil.padr( AV17CodMaq , 6 , "%"),  ' ' ) )
         {
            AV25FMaq = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02IT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02IT3_A130BarCodPar[0] ;
         A132BarCodReo = P02IT3_A132BarCodReo[0] ;
         A129BarCod = P02IT3_A129BarCod[0] ;
         /* Using cursor P02IT4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A44AlbRecCod = P02IT4_A44AlbRecCod[0] ;
            A4295ClasCod = P02IT4_A4295ClasCod[0] ;
            n4295ClasCod = P02IT4_n4295ClasCod[0] ;
            A200BarPieCod = P02IT4_A200BarPieCod[0] ;
            A4295ClasCod = P02IT4_A4295ClasCod[0] ;
            n4295ClasCod = P02IT4_n4295ClasCod[0] ;
            if ( AV23TPeca == A4295ClasCod )
            {
               AV26FPeca = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( ( AV25FMaq == 1 ) && ( AV26FPeca == 1 ) )
      {
         AV27PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclamqtp.this.A396EmprCod;
      this.aP1[0] = pclamqtp.this.AV11Descrip;
      this.aP2[0] = pclamqtp.this.AV12Clave;
      this.aP3[0] = pclamqtp.this.AV27PrdVal;
      this.aP4[0] = pclamqtp.this.AV13BarCod;
      this.aP5[0] = pclamqtp.this.AV14BarCodReo;
      this.aP6[0] = pclamqtp.this.AV15BarCodPar;
      this.aP7[0] = pclamqtp.this.AV21BarLinMaq;
      this.aP8[0] = pclamqtp.this.AV16Accion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17CodMaq = "" ;
      scmdbuf = "" ;
      P02IT2_A396EmprCod = new String[] {""} ;
      P02IT2_A2804RecLinMaq = new short[1] ;
      P02IT2_A130BarCodPar = new String[] {""} ;
      P02IT2_A132BarCodReo = new byte[1] ;
      P02IT2_A129BarCod = new int[1] ;
      P02IT2_A602MaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      P02IT3_A396EmprCod = new String[] {""} ;
      P02IT3_A130BarCodPar = new String[] {""} ;
      P02IT3_A132BarCodReo = new byte[1] ;
      P02IT3_A129BarCod = new int[1] ;
      P02IT4_A44AlbRecCod = new int[1] ;
      P02IT4_A396EmprCod = new String[] {""} ;
      P02IT4_A129BarCod = new int[1] ;
      P02IT4_A132BarCodReo = new byte[1] ;
      P02IT4_A130BarCodPar = new String[] {""} ;
      P02IT4_A4295ClasCod = new short[1] ;
      P02IT4_n4295ClasCod = new boolean[] {false} ;
      P02IT4_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclamqtp__default(),
         new Object[] {
             new Object[] {
            P02IT2_A396EmprCod, P02IT2_A2804RecLinMaq, P02IT2_A130BarCodPar, P02IT2_A132BarCodReo, P02IT2_A129BarCod, P02IT2_A602MaqCod
            }
            , new Object[] {
            P02IT3_A396EmprCod, P02IT3_A130BarCodPar, P02IT3_A132BarCodReo, P02IT3_A129BarCod
            }
            , new Object[] {
            P02IT4_A44AlbRecCod, P02IT4_A396EmprCod, P02IT4_A129BarCod, P02IT4_A132BarCodReo, P02IT4_A130BarCodPar, P02IT4_A4295ClasCod, P02IT4_n4295ClasCod, P02IT4_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27PrdVal ;
   private byte AV14BarCodReo ;
   private byte AV25FMaq ;
   private byte AV26FPeca ;
   private byte A132BarCodReo ;
   private short AV21BarLinMaq ;
   private short AV23TPeca ;
   private short A2804RecLinMaq ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV11Descrip ;
   private String AV12Clave ;
   private String AV15BarCodPar ;
   private String AV16Accion ;
   private String AV17CodMaq ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A200BarPieCod ;
   private boolean n4295ClasCod ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IT2_A396EmprCod ;
   private short[] P02IT2_A2804RecLinMaq ;
   private String[] P02IT2_A130BarCodPar ;
   private byte[] P02IT2_A132BarCodReo ;
   private int[] P02IT2_A129BarCod ;
   private String[] P02IT2_A602MaqCod ;
   private String[] P02IT3_A396EmprCod ;
   private String[] P02IT3_A130BarCodPar ;
   private byte[] P02IT3_A132BarCodReo ;
   private int[] P02IT3_A129BarCod ;
   private int[] P02IT4_A44AlbRecCod ;
   private String[] P02IT4_A396EmprCod ;
   private int[] P02IT4_A129BarCod ;
   private byte[] P02IT4_A132BarCodReo ;
   private String[] P02IT4_A130BarCodPar ;
   private short[] P02IT4_A4295ClasCod ;
   private boolean[] P02IT4_n4295ClasCod ;
   private String[] P02IT4_A200BarPieCod ;
}

final  class pclamqtp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IT2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02IT3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02IT4", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ClasCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

