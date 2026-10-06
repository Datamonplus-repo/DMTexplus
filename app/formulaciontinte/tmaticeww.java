package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tmaticeww", "/app.formulaciontinte.tmaticeww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaticeww extends GXWebObjectStub
{
   public tmaticeww( )
   {
   }

   public tmaticeww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaticeww.class ));
   }

   public tmaticeww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaticeww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaticeww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Matiz";
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

