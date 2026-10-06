package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn04ww", "/app.ttrn04ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn04ww extends GXWebObjectStub
{
   public ttrn04ww( )
   {
   }

   public ttrn04ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn04ww.class ));
   }

   public ttrn04ww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn04ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn04ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento HDRs ( Eliminar)";
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

