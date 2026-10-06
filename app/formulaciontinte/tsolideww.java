package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tsolideww", "/app.formulaciontinte.tsolideww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolideww extends GXWebObjectStub
{
   public tsolideww( )
   {
   }

   public tsolideww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolideww.class ));
   }

   public tsolideww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolideww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolideww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Solidez";
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

