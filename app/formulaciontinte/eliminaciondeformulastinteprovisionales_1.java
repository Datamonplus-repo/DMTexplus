package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinteprovisionales_1", "/app.formulaciontinte.eliminaciondeformulastinteprovisionales_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinteprovisionales_1 extends GXWebObjectStub
{
   public eliminaciondeformulastinteprovisionales_1( )
   {
   }

   public eliminaciondeformulastinteprovisionales_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinteprovisionales_1.class ));
   }

   public eliminaciondeformulastinteprovisionales_1( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinteprovisionales_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinteprovisionales_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminacion de Formulas Tinte Provisionales";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

