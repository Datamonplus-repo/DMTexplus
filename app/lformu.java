package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lformu", "/app.lformu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lformu extends GXWebObjectStub
{
   public lformu( )
   {
   }

   public lformu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lformu.class ));
   }

   public lformu( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lformu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lformu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Procesos Quimicos";
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

