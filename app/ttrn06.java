package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn06", "/app.ttrn06"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn06 extends GXWebObjectStub
{
   public ttrn06( )
   {
   }

   public ttrn06( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn06.class ));
   }

   public ttrn06( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn06_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn06_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guias (Header)";
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

