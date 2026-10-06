package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.getcolorcolorantes_trn", "/app.formulaciontinte.getcolorcolorantes_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class getcolorcolorantes_trn extends GXWebObjectStub
{
   public getcolorcolorantes_trn( )
   {
   }

   public getcolorcolorantes_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( getcolorcolorantes_trn.class ));
   }

   public getcolorcolorantes_trn( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new getcolorcolorantes_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new getcolorcolorantes_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Linea";
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

