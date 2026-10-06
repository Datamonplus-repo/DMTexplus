package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactca", "/app.tactca"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactca extends GXWebObjectStub
{
   public tactca( )
   {
   }

   public tactca( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactca.class ));
   }

   public tactca( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactca_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactca_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO  ACTIVIDAD CALANDRA";
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

