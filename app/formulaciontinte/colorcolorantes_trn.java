package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.colorcolorantes_trn", "/app.formulaciontinte.colorcolorantes_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class colorcolorantes_trn extends GXWebObjectStub
{
   public colorcolorantes_trn( )
   {
   }

   public colorcolorantes_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( colorcolorantes_trn.class ));
   }

   public colorcolorantes_trn( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new colorcolorantes_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new colorcolorantes_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Color Colorantes ";
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

