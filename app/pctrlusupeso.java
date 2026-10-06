package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlusupeso extends GXProcedure
{
   public pctrlusupeso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlusupeso.class ), "" );
   }

   public pctrlusupeso( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 )
   {
      pctrlusupeso.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      pctrlusupeso.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlusupeso.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrlusupeso.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrlusupeso.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrlusupeso.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pctrlusupeso.this.AV8Msg_peso = aP5[0];
      this.aP5 = aP5;
      pctrlusupeso.this.AV9Nveces = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Msg_peso = httpContext.getMessage( "Hdr Pesada.", "") + GXutil.newLine( ) ;
      AV9Nveces = (short)(0) ;
      /* Using cursor P05752 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4576RecLinUsr = P05752_A4576RecLinUsr[0] ;
         A4577RecPesFec = P05752_A4577RecPesFec[0] ;
         A718PrdNom = P05752_A718PrdNom[0] ;
         A719PrdNum = P05752_A719PrdNum[0] ;
         n719PrdNum = P05752_n719PrdNum[0] ;
         A1273RecLinPro = P05752_A1273RecLinPro[0] ;
         A811RecLin = P05752_A811RecLin[0] ;
         A718PrdNom = P05752_A718PrdNom[0] ;
         if ( GXutil.strcmp(A4576RecLinUsr, " ") != 0 )
         {
            AV8Msg_peso += GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + " " + GXutil.trim( A4576RecLinUsr) + " " + GXutil.trim( localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) + GXutil.newLine( ) ;
            AV9Nveces = (short)(AV9Nveces+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlusupeso.this.A396EmprCod;
      this.aP1[0] = pctrlusupeso.this.A129BarCod;
      this.aP2[0] = pctrlusupeso.this.A132BarCodReo;
      this.aP3[0] = pctrlusupeso.this.A130BarCodPar;
      this.aP4[0] = pctrlusupeso.this.A2804RecLinMaq;
      this.aP5[0] = pctrlusupeso.this.AV8Msg_peso;
      this.aP6[0] = pctrlusupeso.this.AV9Nveces;
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
      P05752_A396EmprCod = new String[] {""} ;
      P05752_A129BarCod = new int[1] ;
      P05752_A132BarCodReo = new byte[1] ;
      P05752_A130BarCodPar = new String[] {""} ;
      P05752_A2804RecLinMaq = new short[1] ;
      P05752_A4576RecLinUsr = new String[] {""} ;
      P05752_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05752_A718PrdNom = new String[] {""} ;
      P05752_A719PrdNum = new String[] {""} ;
      P05752_n719PrdNum = new boolean[] {false} ;
      P05752_A1273RecLinPro = new byte[1] ;
      P05752_A811RecLin = new short[1] ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlusupeso__default(),
         new Object[] {
             new Object[] {
            P05752_A396EmprCod, P05752_A129BarCod, P05752_A132BarCodReo, P05752_A130BarCodPar, P05752_A2804RecLinMaq, P05752_A4576RecLinUsr, P05752_A4577RecPesFec, P05752_A718PrdNom, P05752_A719PrdNum, P05752_n719PrdNum,
            P05752_A1273RecLinPro, P05752_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short AV9Nveces ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Msg_peso ;
   private String scmdbuf ;
   private String A4576RecLinUsr ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date A4577RecPesFec ;
   private boolean n719PrdNum ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05752_A396EmprCod ;
   private int[] P05752_A129BarCod ;
   private byte[] P05752_A132BarCodReo ;
   private String[] P05752_A130BarCodPar ;
   private short[] P05752_A2804RecLinMaq ;
   private String[] P05752_A4576RecLinUsr ;
   private java.util.Date[] P05752_A4577RecPesFec ;
   private String[] P05752_A718PrdNom ;
   private String[] P05752_A719PrdNum ;
   private boolean[] P05752_n719PrdNum ;
   private byte[] P05752_A1273RecLinPro ;
   private short[] P05752_A811RecLin ;
}

final  class pctrlusupeso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05752", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinUsr, T1.RecPesFec, T2.PrdNom, T1.PrdNum, T1.RecLinPro, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
      }
   }

}

