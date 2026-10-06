package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn06general", "/app.ttrn06general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn06general extends GXWebObjectStub
{
   public ttrn06general( )
   {
   }

   public ttrn06general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn06general.class ));
   }

   public ttrn06general( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn06general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn06general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn06 General";
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

