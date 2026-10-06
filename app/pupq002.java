package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupq002 extends GXProcedure
{
   public pupq002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupq002.class ), "" );
   }

   public pupq002( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pupq002.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 )
   {
      pupq002.this.AV50Emprcod = aP0[0];
      this.aP0 = aP0;
      pupq002.this.AV74Prdnum1 = aP1[0];
      this.aP1 = aP1;
      pupq002.this.AV75Dif = aP2[0];
      this.aP2 = aP2;
      pupq002.this.AV76Dif2 = aP3[0];
      this.aP3 = aP3;
      pupq002.this.AV78Obs = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV51UsurCod = " " ;
      GXt_char1 = AV52Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pupq002.this.GXt_char1 = GXv_char2[0] ;
      AV52Station = GXt_char1 ;
      GXv_char2[0] = AV50Emprcod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char2, GXv_char3, GXv_char4) ;
      pupq002.this.AV50Emprcod = GXv_char2[0] ;
      pupq002.this.AV53EmprNom = GXv_char3[0] ;
      pupq002.this.AV51UsurCod = GXv_char4[0] ;
      AV69Prdexialm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KD2 */
      pr_default.execute(0, new Object[] {AV50Emprcod, AV74Prdnum1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05KD2_A719PrdNum[0] ;
         A396EmprCod = P05KD2_A396EmprCod[0] ;
         A704PrdExiAlm = P05KD2_A704PrdExiAlm[0] ;
         A718PrdNom = P05KD2_A718PrdNom[0] ;
         AV49Prdnum = A719PrdNum ;
         AV69Prdexialm = A704PrdExiAlm ;
         AV70prdNom = A718PrdNom ;
         AV86Entalm = (byte)(0) ;
         if ( ( AV75Dif.doubleValue() < 0 ) && ( AV76Dif2.doubleValue() == 0 ) )
         {
            AV75Dif = ((AV75Dif.doubleValue()<0) ? (AV75Dif.multiply(DecimalUtil.doubleToDec(-1))) : AV75Dif) ;
            AV81CantNew = A704PrdExiAlm.add(AV75Dif) ;
            AV80Inc_obs = httpContext.getMessage( "Actualizamos PRODUC.PrdExiAlm ", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + GXutil.newLine( ) ;
            AV80Inc_obs += httpContext.getMessage( "Cant Ant         = ", "") + GXutil.trim( GXutil.str( AV69Prdexialm, 12, 4)) + GXutil.newLine( ) ;
            AV80Inc_obs += httpContext.getMessage( "CAnt New         = ", "") + GXutil.trim( GXutil.str( AV81CantNew, 12, 4)) + GXutil.newLine( ) ;
            A704PrdExiAlm = ((AV81CantNew.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV81CantNew) ;
            A704PrdExiAlm = ((A704PrdExiAlm.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A704PrdExiAlm) ;
            AV80Inc_obs += httpContext.getMessage( "Cant BD,PrdExialm= ", "") + GXutil.trim( GXutil.str( A704PrdExiAlm, 12, 4)) + GXutil.newLine( ) ;
            AV59Control = AV80Inc_obs ;
            System.out.println( AV59Control );
            AV86Entalm = (byte)(0) ;
            /* Using cursor P05KD3 */
            pr_default.execute(1, new Object[] {AV50Emprcod, AV49Prdnum});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A411EntCon = P05KD3_A411EntCon[0] ;
               A719PrdNum = P05KD3_A719PrdNum[0] ;
               A396EmprCod = P05KD3_A396EmprCod[0] ;
               A415EntFecEnt = P05KD3_A415EntFecEnt[0] ;
               A597LinEnt = P05KD3_A597LinEnt[0] ;
               AV86Entalm = (byte)(1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         if ( AV75Dif.doubleValue() > 0 )
         {
            AV81CantNew = A704PrdExiAlm.subtract(AV75Dif) ;
            AV80Inc_obs = httpContext.getMessage( "Actualizamos PRODUC.PrdExiAlm ", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + GXutil.newLine( ) ;
            AV80Inc_obs += httpContext.getMessage( "Cant Ant         = ", "") + GXutil.trim( GXutil.str( AV69Prdexialm, 12, 4)) + GXutil.newLine( ) ;
            AV80Inc_obs += httpContext.getMessage( "CAnt New         = ", "") + GXutil.trim( GXutil.str( AV81CantNew, 12, 4)) + GXutil.newLine( ) ;
            A704PrdExiAlm = ((AV81CantNew.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV81CantNew) ;
            A704PrdExiAlm = ((A704PrdExiAlm.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A704PrdExiAlm) ;
            AV80Inc_obs += httpContext.getMessage( "Cant BD,PrdExialm= ", "") + GXutil.trim( GXutil.str( A704PrdExiAlm, 12, 4)) + GXutil.newLine( ) ;
            AV59Control = AV80Inc_obs ;
            System.out.println( AV59Control );
         }
         if ( AV76Dif2.doubleValue() < 0 )
         {
            AV85Exis = ((AV76Dif2.doubleValue()<0) ? (AV76Dif2.multiply(DecimalUtil.doubleToDec(-1))) : AV76Dif2) ;
            /* Using cursor P05KD4 */
            pr_default.execute(2, new Object[] {AV50Emprcod, AV49Prdnum});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A411EntCon = P05KD4_A411EntCon[0] ;
               A719PrdNum = P05KD4_A719PrdNum[0] ;
               A396EmprCod = P05KD4_A396EmprCod[0] ;
               A419EntUniRem = P05KD4_A419EntUniRem[0] ;
               A597LinEnt = P05KD4_A597LinEnt[0] ;
               A415EntFecEnt = P05KD4_A415EntFecEnt[0] ;
               if ( DecimalUtil.compareTo(AV85Exis, A419EntUniRem) == 0 )
               {
                  AV80Inc_obs = httpContext.getMessage( "Caso1.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                  AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
                  AV80Inc_obs += httpContext.getMessage( "Remanente New= ", "") + "0" + GXutil.newLine( ) ;
                  AV59Control = AV80Inc_obs ;
                  System.out.println( AV59Control );
                  AV85Exis = DecimalUtil.doubleToDec(0) ;
                  A419EntUniRem = DecimalUtil.doubleToDec(0) ;
                  A411EntCon = (byte)(1) ;
               }
               else
               {
                  if ( DecimalUtil.compareTo(AV85Exis, A419EntUniRem) < 0 )
                  {
                     AV80Inc_obs = httpContext.getMessage( "Caso2.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Exis         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
                     AV59Control = AV80Inc_obs ;
                     System.out.println( AV59Control );
                     A419EntUniRem = A419EntUniRem.subtract(AV85Exis) ;
                     AV85Exis = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     A411EntCon = (byte)(1) ;
                     AV85Exis = AV85Exis.subtract(A419EntUniRem) ;
                     A419EntUniRem = DecimalUtil.doubleToDec(0) ;
                     AV80Inc_obs = httpContext.getMessage( "Caso3.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + "0" + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Exis         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
                  }
               }
               if ( AV85Exis.doubleValue() == 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  /* Using cursor P05KD5 */
                  pr_default.execute(3, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if (true) break;
               }
               /* Using cursor P05KD6 */
               pr_default.execute(4, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         if ( AV76Dif2.doubleValue() > 0 )
         {
            AV85Exis = ((AV76Dif2.doubleValue()<0) ? (AV76Dif2.multiply(DecimalUtil.doubleToDec(-1))) : AV76Dif2) ;
            AV86Entalm = (byte)(0) ;
            /* Using cursor P05KD7 */
            pr_default.execute(5, new Object[] {AV50Emprcod, AV49Prdnum});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A411EntCon = P05KD7_A411EntCon[0] ;
               A719PrdNum = P05KD7_A719PrdNum[0] ;
               A396EmprCod = P05KD7_A396EmprCod[0] ;
               A419EntUniRem = P05KD7_A419EntUniRem[0] ;
               A597LinEnt = P05KD7_A597LinEnt[0] ;
               A415EntFecEnt = P05KD7_A415EntFecEnt[0] ;
               A419EntUniRem = A419EntUniRem.add(AV85Exis) ;
               AV80Inc_obs = httpContext.getMessage( "Caso4.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
               AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
               AV80Inc_obs += httpContext.getMessage( "Sumo         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
               AV59Control = AV80Inc_obs ;
               System.out.println( AV59Control );
               AV86Entalm = (byte)(1) ;
               /* Using cursor P05KD8 */
               pr_default.execute(6, new Object[] {A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV86Entalm == 0 )
            {
               /* Using cursor P05KD9 */
               pr_default.execute(7, new Object[] {AV50Emprcod, AV49Prdnum});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A411EntCon = P05KD9_A411EntCon[0] ;
                  A719PrdNum = P05KD9_A719PrdNum[0] ;
                  A396EmprCod = P05KD9_A396EmprCod[0] ;
                  A418EntUniEnt = P05KD9_A418EntUniEnt[0] ;
                  A419EntUniRem = P05KD9_A419EntUniRem[0] ;
                  A597LinEnt = P05KD9_A597LinEnt[0] ;
                  A415EntFecEnt = P05KD9_A415EntFecEnt[0] ;
                  if ( DecimalUtil.compareTo(AV85Exis, A418EntUniEnt) > 0 )
                  {
                     A419EntUniRem = A418EntUniEnt ;
                     A411EntCon = (byte)(0) ;
                     AV85Exis = AV85Exis.subtract(A418EntUniEnt) ;
                     AV85Exis = ((AV85Exis.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV85Exis) ;
                     AV80Inc_obs = httpContext.getMessage( "Caso5.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Exis         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
                     AV59Control = AV80Inc_obs ;
                     System.out.println( AV59Control );
                  }
                  else
                  {
                     A419EntUniRem = AV85Exis ;
                     A411EntCon = (byte)(0) ;
                     AV85Exis = DecimalUtil.doubleToDec(0) ;
                     AV80Inc_obs = httpContext.getMessage( "Caso6.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
                     AV80Inc_obs += httpContext.getMessage( "Exis         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
                     AV59Control = AV80Inc_obs ;
                     System.out.println( AV59Control );
                  }
                  if ( AV85Exis.doubleValue() == 0 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     /* Using cursor P05KD10 */
                     pr_default.execute(8, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                     if (true) break;
                  }
                  /* Using cursor P05KD11 */
                  pr_default.execute(9, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
         }
         if ( ( AV76Dif2.doubleValue() == 0 ) && ( AV75Dif.doubleValue() < 0 ) && ( AV86Entalm == 0 ) )
         {
            AV85Exis = ((AV75Dif.doubleValue()<0) ? (AV75Dif.multiply(DecimalUtil.doubleToDec(-1))) : AV75Dif) ;
            /* Using cursor P05KD12 */
            pr_default.execute(10, new Object[] {AV50Emprcod, AV49Prdnum});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A411EntCon = P05KD12_A411EntCon[0] ;
               A719PrdNum = P05KD12_A719PrdNum[0] ;
               A396EmprCod = P05KD12_A396EmprCod[0] ;
               A418EntUniEnt = P05KD12_A418EntUniEnt[0] ;
               A419EntUniRem = P05KD12_A419EntUniRem[0] ;
               A597LinEnt = P05KD12_A597LinEnt[0] ;
               A415EntFecEnt = P05KD12_A415EntFecEnt[0] ;
               if ( DecimalUtil.compareTo(AV85Exis, A418EntUniEnt) > 0 )
               {
                  A419EntUniRem = A418EntUniEnt ;
                  A411EntCon = (byte)(0) ;
                  AV85Exis = AV85Exis.subtract(A418EntUniEnt) ;
                  AV85Exis = ((AV85Exis.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV85Exis) ;
                  AV80Inc_obs = httpContext.getMessage( "Caso7.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                  AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
                  AV80Inc_obs += httpContext.getMessage( "Exis         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
                  AV59Control = AV80Inc_obs ;
                  System.out.println( AV59Control );
               }
               else
               {
                  A419EntUniRem = AV85Exis ;
                  A411EntCon = (byte)(0) ;
                  AV85Exis = DecimalUtil.doubleToDec(0) ;
                  AV80Inc_obs = httpContext.getMessage( "Caso8.Actualizamos ENTALM.", "") + AV49Prdnum + " " + GXutil.trim( AV70prdNom) + httpContext.getMessage( " LinEnt =", "") + GXutil.str( A597LinEnt, 4, 0) + GXutil.newLine( ) ;
                  AV80Inc_obs += httpContext.getMessage( "Remanente    = ", "") + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + GXutil.newLine( ) ;
                  AV80Inc_obs += httpContext.getMessage( "Exis         = ", "") + GXutil.trim( GXutil.str( AV85Exis, 11, 4)) + GXutil.newLine( ) ;
                  AV59Control = AV80Inc_obs ;
                  System.out.println( AV59Control );
               }
               if ( AV85Exis.doubleValue() == 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  /* Using cursor P05KD13 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if (true) break;
               }
               /* Using cursor P05KD14 */
               pr_default.execute(12, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               pr_default.readNext(10);
            }
            pr_default.close(10);
         }
         /* Using cursor P05KD15 */
         pr_default.execute(13, new Object[] {A704PrdExiAlm, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupq002.this.AV50Emprcod;
      this.aP1[0] = pupq002.this.AV74Prdnum1;
      this.aP2[0] = pupq002.this.AV75Dif;
      this.aP3[0] = pupq002.this.AV76Dif2;
      this.aP4[0] = pupq002.this.AV78Obs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51UsurCod = "" ;
      AV52Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV53EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV69Prdexialm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05KD2_A719PrdNum = new String[] {""} ;
      P05KD2_A396EmprCod = new String[] {""} ;
      P05KD2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV49Prdnum = "" ;
      AV70prdNom = "" ;
      AV81CantNew = DecimalUtil.ZERO ;
      AV80Inc_obs = "" ;
      AV59Control = "" ;
      P05KD3_A411EntCon = new byte[1] ;
      P05KD3_A719PrdNum = new String[] {""} ;
      P05KD3_A396EmprCod = new String[] {""} ;
      P05KD3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05KD3_A597LinEnt = new short[1] ;
      A415EntFecEnt = GXutil.nullDate() ;
      AV85Exis = DecimalUtil.ZERO ;
      P05KD4_A411EntCon = new byte[1] ;
      P05KD4_A719PrdNum = new String[] {""} ;
      P05KD4_A396EmprCod = new String[] {""} ;
      P05KD4_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD4_A597LinEnt = new short[1] ;
      P05KD4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A419EntUniRem = DecimalUtil.ZERO ;
      P05KD7_A411EntCon = new byte[1] ;
      P05KD7_A719PrdNum = new String[] {""} ;
      P05KD7_A396EmprCod = new String[] {""} ;
      P05KD7_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD7_A597LinEnt = new short[1] ;
      P05KD7_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05KD9_A411EntCon = new byte[1] ;
      P05KD9_A719PrdNum = new String[] {""} ;
      P05KD9_A396EmprCod = new String[] {""} ;
      P05KD9_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD9_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD9_A597LinEnt = new short[1] ;
      P05KD9_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      P05KD12_A411EntCon = new byte[1] ;
      P05KD12_A719PrdNum = new String[] {""} ;
      P05KD12_A396EmprCod = new String[] {""} ;
      P05KD12_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD12_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KD12_A597LinEnt = new short[1] ;
      P05KD12_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupq002__default(),
         new Object[] {
             new Object[] {
            P05KD2_A719PrdNum, P05KD2_A396EmprCod, P05KD2_A704PrdExiAlm, P05KD2_A718PrdNom
            }
            , new Object[] {
            P05KD3_A411EntCon, P05KD3_A719PrdNum, P05KD3_A396EmprCod, P05KD3_A415EntFecEnt, P05KD3_A597LinEnt
            }
            , new Object[] {
            P05KD4_A411EntCon, P05KD4_A719PrdNum, P05KD4_A396EmprCod, P05KD4_A419EntUniRem, P05KD4_A597LinEnt, P05KD4_A415EntFecEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05KD7_A411EntCon, P05KD7_A719PrdNum, P05KD7_A396EmprCod, P05KD7_A419EntUniRem, P05KD7_A597LinEnt, P05KD7_A415EntFecEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P05KD9_A411EntCon, P05KD9_A719PrdNum, P05KD9_A396EmprCod, P05KD9_A418EntUniEnt, P05KD9_A419EntUniRem, P05KD9_A597LinEnt, P05KD9_A415EntFecEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05KD12_A411EntCon, P05KD12_A719PrdNum, P05KD12_A396EmprCod, P05KD12_A418EntUniEnt, P05KD12_A419EntUniRem, P05KD12_A597LinEnt, P05KD12_A415EntFecEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV86Entalm ;
   private byte A411EntCon ;
   private short A597LinEnt ;
   private short Gx_err ;
   private java.math.BigDecimal AV75Dif ;
   private java.math.BigDecimal AV76Dif2 ;
   private java.math.BigDecimal AV69Prdexialm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV81CantNew ;
   private java.math.BigDecimal AV85Exis ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A418EntUniEnt ;
   private String AV50Emprcod ;
   private String AV74Prdnum1 ;
   private String AV78Obs ;
   private String AV51UsurCod ;
   private String AV52Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV53EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV49Prdnum ;
   private String AV70prdNom ;
   private java.util.Date A415EntFecEnt ;
   private String AV80Inc_obs ;
   private String AV59Control ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05KD2_A719PrdNum ;
   private String[] P05KD2_A396EmprCod ;
   private java.math.BigDecimal[] P05KD2_A704PrdExiAlm ;
   private String[] P05KD2_A718PrdNom ;
   private byte[] P05KD3_A411EntCon ;
   private String[] P05KD3_A719PrdNum ;
   private String[] P05KD3_A396EmprCod ;
   private java.util.Date[] P05KD3_A415EntFecEnt ;
   private short[] P05KD3_A597LinEnt ;
   private byte[] P05KD4_A411EntCon ;
   private String[] P05KD4_A719PrdNum ;
   private String[] P05KD4_A396EmprCod ;
   private java.math.BigDecimal[] P05KD4_A419EntUniRem ;
   private short[] P05KD4_A597LinEnt ;
   private java.util.Date[] P05KD4_A415EntFecEnt ;
   private byte[] P05KD7_A411EntCon ;
   private String[] P05KD7_A719PrdNum ;
   private String[] P05KD7_A396EmprCod ;
   private java.math.BigDecimal[] P05KD7_A419EntUniRem ;
   private short[] P05KD7_A597LinEnt ;
   private java.util.Date[] P05KD7_A415EntFecEnt ;
   private byte[] P05KD9_A411EntCon ;
   private String[] P05KD9_A719PrdNum ;
   private String[] P05KD9_A396EmprCod ;
   private java.math.BigDecimal[] P05KD9_A418EntUniEnt ;
   private java.math.BigDecimal[] P05KD9_A419EntUniRem ;
   private short[] P05KD9_A597LinEnt ;
   private java.util.Date[] P05KD9_A415EntFecEnt ;
   private byte[] P05KD12_A411EntCon ;
   private String[] P05KD12_A719PrdNum ;
   private String[] P05KD12_A396EmprCod ;
   private java.math.BigDecimal[] P05KD12_A418EntUniEnt ;
   private java.math.BigDecimal[] P05KD12_A419EntUniRem ;
   private short[] P05KD12_A597LinEnt ;
   private java.util.Date[] P05KD12_A415EntFecEnt ;
}

final  class pupq002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KD2", "SELECT PrdNum, EmprCod, PrdExiAlm, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KD3", "SELECT EntCon, PrdNum, EmprCod, EntFecEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KD4", "SELECT EntCon, PrdNum, EmprCod, EntUniRem, LinEnt, EntFecEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05KD5", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P05KD6", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P05KD7", "SELECT EntCon, PrdNum, EmprCod, EntUniRem, LinEnt, EntFecEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05KD8", "UPDATE TXPENTALM SET EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P05KD9", "SELECT EntCon, PrdNum, EmprCod, EntUniEnt, EntUniRem, LinEnt, EntFecEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 1) ORDER BY EmprCod DESC, PrdNum DESC, EntFecEnt DESC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05KD10", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P05KD11", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P05KD12", "SELECT EntCon, PrdNum, EmprCod, EntUniEnt, EntUniRem, LinEnt, EntFecEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 1) ORDER BY EmprCod DESC, PrdNum DESC, EntFecEnt DESC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05KD13", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P05KD14", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P05KD15", "UPDATE TXPPRODUC SET PrdExiAlm=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

