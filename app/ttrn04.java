package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn04", "/app.ttrn04"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn04 extends GXWebObjectStub
{
   public ttrn04( )
   {
   }

   public ttrn04( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn04.class ));
   }

   public ttrn04( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn04_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn04_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento HDRs";
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

