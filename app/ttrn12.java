package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn12", "/app.ttrn12"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn12 extends GXWebObjectStub
{
   public ttrn12( )
   {
   }

   public ttrn12( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn12.class ));
   }

   public ttrn12( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn12_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn12_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guias (Observaciones)";
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

