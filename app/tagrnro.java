package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tagrnro", "/app.tagrnro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tagrnro extends GXWebObjectStub
{
   public tagrnro( )
   {
   }

   public tagrnro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tagrnro.class ));
   }

   public tagrnro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tagrnro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tagrnro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AGRUPACION PLAN RITEX";
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

