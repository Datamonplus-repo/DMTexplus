package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwccstding", "/app.controlcalidadhtd.wwccstding"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwccstding extends GXWebObjectStub
{
   public wwccstding( )
   {
   }

   public wwccstding( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwccstding.class ));
   }

   public wwccstding( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwccstding_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwccstding_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control de Calidad Standart";
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

