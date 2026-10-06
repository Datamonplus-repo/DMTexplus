package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcentcot extends GXProcedure
{
   public rcentcot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcentcot.class ), "" );
   }

   public rcentcot( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 )
   {
      rcentcot.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 )
   {
      rcentcot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rcentcot.this.AV8PCcoco = aP1[0];
      this.aP1 = aP1;
      rcentcot.this.AV9UCcoco = aP2[0];
      this.aP2 = aP2;
      rcentcot.this.AV10PFecha = aP3[0];
      this.aP3 = aP3;
      rcentcot.this.AV11UFecha = aP4[0];
      this.aP4 = aP4;
      rcentcot.this.AV36Planom = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40isExist = false ;
      AV39file.setSource( AV36Planom );
      if ( AV39file.exists() )
      {
         AV40isExist = true ;
      }
      else
      {
         AV39file.create();
         AV39file.close();
      }
      if ( AV40isExist )
      {
         AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwopen( AV36Planom, ";", "\"", (byte)(0), httpContext.getMessage( "utf-8", "")) ;
      }
      if ( AV37Nf.doubleValue() == -1 )
      {
         Gx_msg = httpContext.getMessage( "Error de apertura del archivo ", "") + AV36Planom ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV35Linea = " " ;
         AV35Linea = httpContext.getMessage( "Codigo", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Cantidad", "") + ";" + httpContext.getMessage( "Valor", "") ;
         AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwptxt( GXutil.trim( AV35Linea), 0) ;
         AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
         if ( AV38Z.doubleValue() == 0 )
         {
            Gx_msg = httpContext.getMessage( "Error de grabacion en el fichero ", "") + AV36Planom ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         AV35Linea = " " ;
         AV18Total_sg = DecimalUtil.doubleToDec(0) ;
         AV19Total_vg = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07LD2 */
         pr_default.execute(0, new Object[] {Short.valueOf(AV8PCcoco), A396EmprCod, Short.valueOf(AV9UCcoco)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk7LD2 = false ;
            A3344CCStkCanS = P07LD2_A3344CCStkCanS[0] ;
            A3349CCStkPre = P07LD2_A3349CCStkPre[0] ;
            A3345TipMovCc = P07LD2_A3345TipMovCc[0] ;
            A3348CCStkFec = P07LD2_A3348CCStkFec[0] ;
            A3840CcoDsc = P07LD2_A3840CcoDsc[0] ;
            n3840CcoDsc = P07LD2_n3840CcoDsc[0] ;
            A3839CcoCod = P07LD2_A3839CcoCod[0] ;
            A718PrdNom = P07LD2_A718PrdNom[0] ;
            A719PrdNum = P07LD2_A719PrdNum[0] ;
            A3343CCStkCanE = P07LD2_A3343CCStkCanE[0] ;
            A3342CCStkLin = P07LD2_A3342CCStkLin[0] ;
            A3840CcoDsc = P07LD2_A3840CcoDsc[0] ;
            n3840CcoDsc = P07LD2_n3840CcoDsc[0] ;
            A718PrdNom = P07LD2_A718PrdNom[0] ;
            AV13F_cab = (byte)(0) ;
            AV16Total_s = DecimalUtil.doubleToDec(0) ;
            AV17Total_v = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( P07LD2_A3839CcoCod[0] == A3839CcoCod ) )
            {
               brk7LD2 = false ;
               A3344CCStkCanS = P07LD2_A3344CCStkCanS[0] ;
               A3349CCStkPre = P07LD2_A3349CCStkPre[0] ;
               A3345TipMovCc = P07LD2_A3345TipMovCc[0] ;
               A3348CCStkFec = P07LD2_A3348CCStkFec[0] ;
               A3840CcoDsc = P07LD2_A3840CcoDsc[0] ;
               n3840CcoDsc = P07LD2_n3840CcoDsc[0] ;
               A718PrdNom = P07LD2_A718PrdNom[0] ;
               A719PrdNum = P07LD2_A719PrdNum[0] ;
               A3342CCStkLin = P07LD2_A3342CCStkLin[0] ;
               A3840CcoDsc = P07LD2_A3840CcoDsc[0] ;
               n3840CcoDsc = P07LD2_n3840CcoDsc[0] ;
               A718PrdNom = P07LD2_A718PrdNom[0] ;
               if ( GXutil.strcmp(P07LD2_A396EmprCod[0], A396EmprCod) == 0 )
               {
                  if ( (( GXutil.resetTime(A3348CCStkFec).after( GXutil.resetTime( AV10PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV10PFecha)) )) && (( GXutil.resetTime(A3348CCStkFec).before( GXutil.resetTime( AV11UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV11UFecha)) )) )
                  {
                     if ( ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "PP") == 0 ) )
                     {
                        AV14CCSTKCANS = DecimalUtil.doubleToDec(0) ;
                        AV15Valors = DecimalUtil.doubleToDec(0) ;
                        while ( (pr_default.getStatus(0) != 101) && ( P07LD2_A3839CcoCod[0] == A3839CcoCod ) && ( GXutil.strcmp(P07LD2_A719PrdNum[0], A719PrdNum) == 0 ) )
                        {
                           brk7LD2 = false ;
                           A3344CCStkCanS = P07LD2_A3344CCStkCanS[0] ;
                           A3349CCStkPre = P07LD2_A3349CCStkPre[0] ;
                           A3345TipMovCc = P07LD2_A3345TipMovCc[0] ;
                           A3348CCStkFec = P07LD2_A3348CCStkFec[0] ;
                           A3342CCStkLin = P07LD2_A3342CCStkLin[0] ;
                           if ( GXutil.strcmp(P07LD2_A396EmprCod[0], A396EmprCod) == 0 )
                           {
                              if ( (( GXutil.resetTime(A3348CCStkFec).after( GXutil.resetTime( AV10PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV10PFecha)) )) && (( GXutil.resetTime(A3348CCStkFec).before( GXutil.resetTime( AV11UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV11UFecha)) )) )
                              {
                                 if ( ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "PP") == 0 ) )
                                 {
                                    AV14CCSTKCANS = AV14CCSTKCANS.add(A3344CCStkCanS) ;
                                    AV15Valors = AV15Valors.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                                 }
                              }
                           }
                           brk7LD2 = true ;
                           pr_default.readNext(0);
                        }
                        AV35Linea = GXutil.str( A3839CcoCod, 3, 0) + ";" + A3840CcoDsc ;
                        AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwptxt( GXutil.trim( AV35Linea), 0) ;
                        AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
                        if ( AV14CCSTKCANS.doubleValue() > 0 )
                        {
                           AV35Linea += ";" + A719PrdNum + ";" + A718PrdNom + ";" + GXutil.str( AV14CCSTKCANS, 14, 4) + ";" + GXutil.str( AV15Valors, 14, 2) ;
                           AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwptxt( GXutil.trim( AV35Linea), 0) ;
                           AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
                        }
                        AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwptxt( GXutil.trim( AV35Linea), 0) ;
                        AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
                        if ( AV38Z.doubleValue() == 0 )
                        {
                           Gx_msg = httpContext.getMessage( "Error de grabacion en el fichero ", "") + AV36Planom ;
                           httpContext.GX_msglist.addItem(Gx_msg);
                        }
                        AV35Linea = " " ;
                        AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwptxt( GXutil.trim( AV35Linea), 0) ;
                        AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
                     }
                  }
               }
               if ( ! brk7LD2 )
               {
                  brk7LD2 = true ;
                  pr_default.readNext(0);
               }
            }
            if ( ! brk7LD2 )
            {
               brk7LD2 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         AV41retorno = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcentcot.this.A396EmprCod;
      this.aP1[0] = rcentcot.this.AV8PCcoco;
      this.aP2[0] = rcentcot.this.AV9UCcoco;
      this.aP3[0] = rcentcot.this.AV10PFecha;
      this.aP4[0] = rcentcot.this.AV11UFecha;
      this.aP5[0] = rcentcot.this.AV36Planom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39file = new com.genexus.util.GXFile();
      AV37Nf = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV35Linea = "" ;
      AV38Z = DecimalUtil.ZERO ;
      AV18Total_sg = DecimalUtil.ZERO ;
      AV19Total_vg = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P07LD2_A396EmprCod = new String[] {""} ;
      P07LD2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07LD2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07LD2_A3345TipMovCc = new String[] {""} ;
      P07LD2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07LD2_A3840CcoDsc = new String[] {""} ;
      P07LD2_n3840CcoDsc = new boolean[] {false} ;
      P07LD2_A3839CcoCod = new short[1] ;
      P07LD2_A718PrdNom = new String[] {""} ;
      P07LD2_A719PrdNum = new String[] {""} ;
      P07LD2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07LD2_A3342CCStkLin = new long[1] ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3840CcoDsc = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      AV16Total_s = DecimalUtil.ZERO ;
      AV17Total_v = DecimalUtil.ZERO ;
      AV14CCSTKCANS = DecimalUtil.ZERO ;
      AV15Valors = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rcentcot__default(),
         new Object[] {
             new Object[] {
            P07LD2_A396EmprCod, P07LD2_A3344CCStkCanS, P07LD2_A3349CCStkPre, P07LD2_A3345TipMovCc, P07LD2_A3348CCStkFec, P07LD2_A3840CcoDsc, P07LD2_n3840CcoDsc, P07LD2_A3839CcoCod, P07LD2_A718PrdNom, P07LD2_A719PrdNum,
            P07LD2_A3343CCStkCanE, P07LD2_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13F_cab ;
   private short AV8PCcoco ;
   private short AV9UCcoco ;
   private short AV41retorno ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV37Nf ;
   private java.math.BigDecimal AV38Z ;
   private java.math.BigDecimal AV18Total_sg ;
   private java.math.BigDecimal AV19Total_vg ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal AV16Total_s ;
   private java.math.BigDecimal AV17Total_v ;
   private java.math.BigDecimal AV14CCSTKCANS ;
   private java.math.BigDecimal AV15Valors ;
   private String A396EmprCod ;
   private String AV36Planom ;
   private String Gx_msg ;
   private String AV35Linea ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private String A3840CcoDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date AV10PFecha ;
   private java.util.Date AV11UFecha ;
   private java.util.Date A3348CCStkFec ;
   private boolean AV40isExist ;
   private boolean returnInSub ;
   private boolean brk7LD2 ;
   private boolean n3840CcoDsc ;
   private com.genexus.util.GXFile AV39file ;
   private String[] aP5 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07LD2_A396EmprCod ;
   private java.math.BigDecimal[] P07LD2_A3344CCStkCanS ;
   private java.math.BigDecimal[] P07LD2_A3349CCStkPre ;
   private String[] P07LD2_A3345TipMovCc ;
   private java.util.Date[] P07LD2_A3348CCStkFec ;
   private String[] P07LD2_A3840CcoDsc ;
   private boolean[] P07LD2_n3840CcoDsc ;
   private short[] P07LD2_A3839CcoCod ;
   private String[] P07LD2_A718PrdNom ;
   private String[] P07LD2_A719PrdNum ;
   private java.math.BigDecimal[] P07LD2_A3343CCStkCanE ;
   private long[] P07LD2_A3342CCStkLin ;
}

final  class rcentcot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07LD2", "SELECT T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.TipMovCc, T1.CCStkFec, T2.CcoDsc, T1.CcoCod, T3.PrdNom, T1.PrdNum, T1.CCStkCanE, T1.CCStkLin FROM ((TXPCCSTKS T1 INNER JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.CcoCod >= ?) AND (T1.EmprCod = ?) AND (T1.TipMovCc = 'SM' or T1.TipMovCc = 'PP') AND (T1.CcoCod <= ?) ORDER BY T1.CcoCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((long[]) buf[11])[0] = rslt.getLong(11);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

