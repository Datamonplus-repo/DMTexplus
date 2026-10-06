package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn06ww", "/app.ttrn06ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn06ww extends GXWebObjectStub
{
   public ttrn06ww( )
   {
   }

   public ttrn06ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn06ww.class ));
   }

   public ttrn06ww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn06ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn06ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Guias (Header)";
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

