package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn11", "/app.ttrn11"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn11 extends GXWebObjectStub
{
   public ttrn11( )
   {
   }

   public ttrn11( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn11.class ));
   }

   public ttrn11( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn11_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn11_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla CC, CC1";
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

