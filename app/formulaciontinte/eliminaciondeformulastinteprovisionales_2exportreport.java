package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinteprovisionales_2exportreport", "/app.formulaciontinte.eliminaciondeformulastinteprovisionales_2exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinteprovisionales_2exportreport extends GXWebObjectStub
{
   public eliminaciondeformulastinteprovisionales_2exportreport( )
   {
   }

   public eliminaciondeformulastinteprovisionales_2exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinteprovisionales_2exportreport.class ));
   }

   public eliminaciondeformulastinteprovisionales_2exportreport( int remoteHandle ,
                                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinteprovisionales_2exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinteprovisionales_2exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminacion de Formulas Provisionales";
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

